<template>
  <el-dialog :title="title" 
    :visible.sync="contentVisiable" 
    @close="closeDialog"
    width="85%">
    <el-form :inline="true" ref="dataForm" :model="temp" label-position="left" label-width="120px">
      <el-collapse v-model="collapseActiveName" @change="handleCollapseChange">
        <el-collapse-item title="产品名称" name="1">
          <ProductInfoCard :tempData="temp.productInfo"></ProductInfoCard>
        </el-collapse-item>
        
        <el-collapse-item title="客户信息" name="2">
          <CustomerInfoCard :tempData="temp.customerInfo"></CustomerInfoCard>
        </el-collapse-item>
      </el-collapse>
      <br/>
      <br/>
      <!--叶签操作合集-->
      <el-tabs type="border-card">
        <el-tab-pane label="销售发起">
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
import { initReplaceUpdateData, initReplaceAddData, parseTime, randomNum } from '@/utils/viewCompUtil'
import ProductInfoCard from '@/views/product/compinfo/components/ProductInfoCard'
import CustomerInfoCard from '@/views/product/compinfo/components/CustomerInfoCard'

export default {
  name: 'Productcompcontent',
  components: { ProductInfoCard, CustomerInfoCard },
  props: ["replace", "title", "visiable", 'action', 'updateRow'],
  computed: {
    ...mapGetters([
      'listData', 'columns', 'name'
    ])
  },
  data() {
    return {
      collapseActiveName: '1', // 折叠面板默认打开
      contentVisiable: true, // dialog 显示框
      temp: {
        // 产品信息
        productInfo: {
          productName: '测试产品111'
        },
        // 客户信息
        customerInfo: {
          customerName: '测试客户111'
        }
      }
    }
  },
  watch: {
    visiable() {
      this.contentVisiable = this.visiable
      if (this.title === '查看' && this.updateRow) {
        this.temp = this.updateRow
      }
    }
  },
  methods: {
    closeDialog() { // 回调关闭Dialog
      this.$emit('close', null)
    },
    sureDialog() { // 确定保存回调Dialog
      this.$emit('close', actTemp)
    },
    handleCollapseChange(val) { // 监听折叠面板变化

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