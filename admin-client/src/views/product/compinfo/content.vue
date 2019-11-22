<template>
  <el-dialog :title="title" 
    :visible.sync="contentVisiable" 
    @close="closeDialog"
    width="85%">
    <el-form :inline="true" ref="dataForm" :model="temp" label-position="left" label-width="120px">
      <el-form-item label="活动名称">
        <el-input v-model="temp.pkBtn"></el-input>
      </el-form-item>

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

export default {
  name: 'Productcompcontent',
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
        pkBtn: undefined,
      }
    }
  },
  watch: {
    visiable() {
      this.contentVisiable = this.visiable
      if (this.title === '录入') {
        this.restTemp()
      }
      if (this.title === '修改' && this.updateRow) {
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
    restTemp() { // 刷新本界面的数据
      this.temp = {
        pkBtn: undefined,
      }
    }
  }
}
</script>

<style>

</style>