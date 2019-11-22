<template>
  <div class="app-container">
    <split-pane split="vertical" :min-percent='15' :default-percent='15' @resize="resize">
      <template slot="paneL">
        <el-input placeholder="输入关键字进行过滤" v-model="menuFilterText" style="width: 99%;"></el-input>
        <el-tree :data="treeData.orderList" :props="treeData.defaultProps" @node-click="orderChange" :filter-node-method="filterNode" ref="treeComp">
          <span class="custom-tree-node" slot-scope="{ node, data }" style="width:100%;">
            <span class="el-tree-node__label">{{ node.label }}</span>
            <span style="display:none">{{ data.id }}</span>
            <span>
              <el-button v-if="node.label!='全部订单'" type="text" size="mini" @click="() => nodeClickOrderContent(data)">详 情</el-button>
            </span>
          </span>
        </el-tree>
      </template>
      <template slot="paneR">
        <div>
          <el-table :data="tableListData.dataList" stripe style="width: 100%">
            <el-table-column prop="pkProductOrderB" label="订单子表主键" v-if="false"></el-table-column>
            <el-table-column prop="name" label="产品名称" width="100"></el-table-column>
            <el-table-column prop="productNum" label="订单产品数量" width="120"></el-table-column>
            <el-table-column prop="code" label="产品编码" width="100"></el-table-column>
            <el-table-column prop="model" label="产品型号" width="100"></el-table-column>
            <el-table-column prop="pkPsndocShow" label="销售负责人" width="120"></el-table-column>
            <el-table-column prop="customerCode" label="客户编码" width="100"></el-table-column>
            <el-table-column prop="billStateShow" label="单据状态" width="140"></el-table-column>
            <el-table-column prop="creationtime" label="创建时间" width="180"></el-table-column>
            <el-table-column label="操作栏">
              <template slot-scope="scope">
                <el-button @click="openProductContent(scope.row)">查看</el-button>
                <el-button @click="openCommitDialog(scope.row)" v-if="scope.row.billState == 0">发起报价</el-button>
              </template>
            </el-table-column>
          </el-table>
          <pagination  v-show="total>0" :total="total" :page.sync="listQuery.page" :limit.sync="listQuery.limit" @pagination="getProductDataList" />
        </div>
      </template>
    </split-pane>

    <!--产品详情-->
    <Productcontent 
      :visiable="content.visiable" 
      :title="content.title"
      :updateRow="content.updateRow"
      @close="closeProductContent"
      @refreshList="getProductDataList">
    </Productcontent>
    <!--新增修改界面-->
    <OrderInfoContent 
      :visiable="orderContent.visiable" 
      :updateRow="orderContent.updateRow"
      @close="closeOrderInfoContent"
      @queryListData="initOrderTreeData">
    </OrderInfoContent>
    <!--送审框Dialog通知钉钉-->
    <CommitDialog
      :visiable="commitDialog.visiable"
      :paramData="commitDialog.paramData"
      @close="closeCommitDialog"
      @commitMethod="startProductQuote">
    </CommitDialog>
  </div>
</template>

<script>
import Pagination from '@/components/Pagination'
import Productcontent from '@/views/salemage/product/content'
import CommitDialog from '@/components/Commitdingding/CommitDialog'
import OrderInfoContent from '@/views/salemage/orders/content'
import { selectAllSaleOrderByPkPsndocAsRef, selectAllSaleOrderProductAsPage, selectProductOrderByPrimaryKey } from '@/api/orders/orders'
import { startQuoteProccess } from '@/api/salemage/product'
import { sendDingMsgByPsndoc } from '@/api/pub/pub'

export default {
  name: 'Orderinfotree',
  components: { Pagination, Productcontent, CommitDialog, OrderInfoContent },
  data() {
    return {
      menuFilterText: '', // 过滤条件
      total: 0, // 数据量
      listQuery: {
        page: 1,
        limit: 20,
      },
      // 树结构相关数据
      treeData: {
        orderList: [],
        defaultProps: {
          children: 'children',
          label: 'label'
        },
        selectTreeNodePk: -99999
      },
      // 通过树联查产品详细数据
      tableListData: {
        dataList: []
      },
      orderContent: {
        visiable: false, // 内容界面显示控制
        updateRow: null // 更新时带过来的temp
      },
      content: {
        visiable: false, // 内容界面显示控制
        title: '', // 标题
        updateRow: null // 更新时带过来的temp
      },
      commitDialog: {
        visiable: false,
        paramData: null
      },
    }
  },
  watch: {
    menuFilterText(val) {
      this.$refs.treeComp.filter(val)
    }
  },
  created() {
    this.initOrderTreeData()
  },
  methods: {
    resize() {
      console.log('resize')
    },
    // 根据调教你过滤树结构
    filterNode(value, data) {
      if (!value) return true
      return data.label.indexOf(value) !== -1
    },
    // 初始所有订单树数据
    initOrderTreeData() {
      let queryParam = { dr: 0 }
      selectAllSaleOrderByPkPsndocAsRef(queryParam).then((response) => {
        if (response.success) {
          this.treeData.orderList = response.object
          this.tableListData.dataList = []
        }
      })
    },
    // 通过订单关联查询产品信息
    orderChange(data) {
      if (data.id) {
        this.treeData.selectTreeNodePk = data.id
        this.listQuery.page = 1
        this.listQuery.limit = 20
        this.getProductDataList()
      }
    },
    // 查询产品集合数据
    getProductDataList() {
      let queryParam = {
        page: this.listQuery.page,
        limit: this.listQuery.limit,
        pkProductOrder: this.treeData.selectTreeNodePk
      }

      selectAllSaleOrderProductAsPage(queryParam).then((response) => {
        if (response.success) {
          let resultListArr = response.object
          if (resultListArr && resultListArr.length > 0) {
            for (let index in resultListArr) {
              let resultOne = resultListArr[index]
              if (resultOne && resultOne.billState != null) {
                switch(resultOne.billState) {
                  case 0: resultOne.billStateShow = '自由态'; break;
                  case 1: resultOne.billStateShow = '报价流程进行中'; break;
                  case 2: resultOne.billStateShow = '已认领'; break;
                  case 3: resultOne.billStateShow = '采购报价完成'; break;
                  case 4: resultOne.billStateShow = '工艺审核完成'; break;
                  case 5: resultOne.billStateShow = '生产报价完成'; break;
                  case 6: resultOne.billStateShow = '销售报价完成'; break;
                  default: break;
                }
              }
            }
          }
          this.tableListData.dataList = resultListArr
          this.total = response.total
        }
      })
    },
    // 开始产品报价
    startProductQuote(sendMsgParam) {
      if (sendMsgParam) {
        this.$confirm('是否确认发起报价?', '提示', {
          confirmButtonText: '确定',
          cancelButtonText: '取消',
          type: 'info'
        }).then(() => {
          let bindRowData = sendMsgParam.paramData
          let publicDingMsgInfo = {
            customerCode: bindRowData.customerCode,
            productCode: bindRowData.code,
            productName: bindRowData.name,
            orderNumber: bindRowData.orderNumber,
            pkPsndoc: bindRowData.pkPsndoc
          }
          sendMsgParam.publicDingMsgInfo = publicDingMsgInfo
          // 消息发送节点
          sendMsgParam.sendTagName = "销售发起报价"
          sendDingMsgByPsndoc(sendMsgParam).then((response) => {
            if (!response.data.success) {
              this.$message({ type: 'info', message: response.errorMessage })
            } else {
              let userid = this.$store.getters.userid
              // 产品名称
              let productName = bindRowData.name == null ? '**' : bindRowData.name
              // 产品编码
              let productCode = bindRowData.code == null ? '**' : bindRowData.code
              // 客户编码
              let customerCode = bindRowData.customerCode == null ? '**' : bindRowData.customerCode
              // 产品主键
              let pkProduct = bindRowData.pkProduct == null ? '**' : bindRowData.pkProduct
              let flowTitle = productName + '_' + productCode + '_' + customerCode
              let commitParam = { 
                pkCustomer: bindRowData.pkCustomer, 
                pkProduct: bindRowData.pkProduct, 
                pkPsndoc: bindRowData.pkPsndoc, 
                flowTitle: flowTitle, 
                userid: userid,
                bdProductPo: bindRowData,
                paramMap: {pcbSource: bindRowData.pcbSource, materialSource: bindRowData.materialSource}
              }
              startQuoteProccess(commitParam).then((response) => {
                if (response.success) {
                  this.$message({ type: 'success', message: '送审成功!' })
                  this.getProductDataList()
                }
              })
            }
          })
        }).catch(() => {
          this.$message({ type: 'info', message: '已取消发起!' })
        })
      }
    },
    // 在树节点中单击详情打开订单详情数据界面
    nodeClickOrderContent(data) {
      if (data && data.id != null && data.id != undefined) {
        let queryParam = {
          pkProductOrder: data.id
        }
        selectProductOrderByPrimaryKey(queryParam).then((response) => {
          if (response.success && response.object) {
            this.openOrderInfoContent(response.object)
          }
        })
      }
      console.log(data)
    },
    // 打开订单详情界面
    openOrderInfoContent(row) {
      this.orderContent.visiable = true
      this.orderContent.updateRow = row
    },
    // 关闭订单详情界面
    closeOrderInfoContent() {
      this.orderContent.visiable = false
    },
    // 打开产品详情界面
    openProductContent(row) {
      this.content.visiable = true
      this.content.updateRow = row
      this.content.title = '查看'
    },
    // 关闭产品详情界面
    closeProductContent() {
      this.content.visiable = false
    },
    // 打开钉钉消息推送Dialog
    openCommitDialog(row) {
      this.commitDialog.paramData = row
      this.commitDialog.visiable = true
    },
    // 关闭钉钉消息推送Dialog
    closeCommitDialog() {
      this.commitDialog.visiable = false
    }
  }
}
</script>

<style>

</style>