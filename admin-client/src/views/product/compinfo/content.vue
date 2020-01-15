<template>
  <el-dialog :title="title" 
    :visible.sync="contentVisiable" 
    @close="closeDialog"
    width="85%">
    <el-form :inline="true" ref="dataForm" :model="temp" label-position="left" label-width="120px">
      <el-tag>订单信息</el-tag>
      <br/><br/>
      <el-card class="box-card">
        <OrderInfo :tempData="temp"></OrderInfo>
      </el-card>
      <br/>
      <el-tag>产品信息</el-tag>
      <br/><br/>
      <el-card class="box-card">
        <ProductInfoCard :tempData="temp.productInfoList"></ProductInfoCard>
      </el-card>
      <br/>
      <!--叶签操作合集-->
      <el-tabs type="border-card">
        <el-tab-pane label="销售发起">
          <OrderPlan></OrderPlan>
        </el-tab-pane>

        <el-tab-pane label="工艺审核">
        </el-tab-pane>

        <el-tab-pane label="生产计划">

        </el-tab-pane>

        <el-tab-pane label="库房备料">
        </el-tab-pane>

        <el-tab-pane label="物料采购">
        </el-tab-pane>

        <el-tab-pane label="来料质检">
        </el-tab-pane>

        <el-tab-pane label="材料入库">
        </el-tab-pane>

        <el-tab-pane label="SMT生产">
        </el-tab-pane>

        <el-tab-pane label="DIP生产">
        </el-tab-pane>

        <el-tab-pane label="成品质检">
        </el-tab-pane>

        <el-tab-pane label="成品入库">
        </el-tab-pane>

        <el-tab-pane label="成品出库">
        </el-tab-pane>

        <el-tab-pane label="通知开票">
        </el-tab-pane>
      </el-tabs>
    </el-form>
  </el-dialog>
</template>

<script>
import { mapGetters } from 'vuex'
import { selectAllOrderInfoAsPage, selectOrderDetailsByPrimary } from '@/api/productionProccess/productionProccess'
import { initReplaceUpdateData, initReplaceAddData, parseTime, randomNum } from '@/utils/viewCompUtil'
import ProductInfoCard from '@/views/product/compinfo/components/ProductInfoCard'
import OrderInfo from '@/views/product/compinfo/components/OrderInfo'
import OrderPlan from '@/views/product/compinfo/components/OrderPlan'

export default {
  name: 'Productcompcontent',
  components: { ProductInfoCard, OrderInfo, OrderPlan },
  props: ["replace", "title", "visiable", 'action', 'updateRow'],
  computed: {
    ...mapGetters([
      'listData', 'columns', 'name'
    ])
  },
  data() {
    return {
      contentVisiable: true, // dialog 显示框
      temp: {
        contractNo: '', // 合同编号
        customerCode: '', // 客户编号
        pkPsndocShow: '', // 销售负责人
        ts: '', // 下单日期
        deliveryData: '', // 预计交货日期 无数据来源
        orderType: '', // 订单类型 无数据来源
        采购负责人: '', // 采购负责人
        采购电话: '', // 采购电话
        技术负责人: '', // 技术电话
        执行标准: '', // 执行标准
        taxinclud: '', // 是否含税
        urgent: '', // 是否加急
        收货地址: '', // 收货地址
        收货联系人: '', // 收货联系人
        收货电话: '', // 收货联系电话
        transportType: '', // 运输方式
      },
      // 产品信息
      productInfoList: []
    }
  },
  watch: {
    visiable() {
      this.contentVisiable = this.visiable
      if (this.title === '查看' && this.updateRow) {
        this.initOrderDetailsInfo()
      }
    }
  },
  methods: {
    // 初始化订单详情数据
    initOrderDetailsInfo() {
      if (this.updateRow && this.updateRow.pkProductOrder) {
        let initParam = { pkProductOrder: this.updateRow.pkProductOrder }
        selectOrderDetailsByPrimary(initParam).then((response) => {
          if (response && response.success && response.object) {
            this.temp = response.object
            this.productInfoList = response.object.productInfoList
            console.log(this.productInfoList)
          }
        })
      } else {
        this.$message({ message: '主键缺失，无法初始化页面数据！', type: 'warning' })
      }
    },
    closeDialog() { // 回调关闭Dialog
      this.$emit('close', null)
    },
    sureDialog() { // 确定保存回调Dialog
      this.$emit('close', actTemp)
    },
    restTemp() { // 刷新本界面的数据
      this.temp = {
        pkBtn: undefined,
      }
    }
  }
}
</script>

<style scoped>
  .text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }

  .box-card {
    width: 100%;
  }
</style>