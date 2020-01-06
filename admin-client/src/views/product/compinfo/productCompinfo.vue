<template>
  <div>
    <!--基础列表界面-->
    <Table :columns="columns" 
      :select="select" 
      :top_btn="top_btn" 
      :act_btn="act_btn" 
      :replace="replace"
      @onButtonClick="onButtonClick">
    </Table>
    <!--新增修改界面-->
    <Productcompcontent 
      :replace="replace"
      :visiable="content.visiable" 
      :title="content.title"
      :action="content.action"
      :updateRow="content.updateRow"
      @close="closeContent">
    </Productcompcontent>
  </div>
</template>

<script>
import Table from '@/components/viewcomp/Table'
import Productcompcontent from '@/views/product/compinfo/content'
import { listProduct } from '@/api/salemage/product'

export default {
  name: "ProductCompinfo",
  components: { Table, Productcompcontent },
  data() {
    return {
      content: {
        visiable: false, // 内容界面显示控制
        title: '', // 标题
        action: null, // 执行Action
        updateRow: null // 更新时带过来的temp
      },
      columns: [
        {prop: 'pkProduct', label: '产品主键', width: '10', primary: true},
        {prop: 'productName', label: '产品名称', width: '160'},
        {prop: 'productCode', label: '产品编码', width: '160'},
        {prop: 'customerName', label: '客户名称', width: '160'},
        {prop: 'customerCode', label: '客户编码', width: '160'},
        {prop: 'customerTel', label: '客户联系方式', width: '220'},
        {prop: 'psndocName', label: '销售负责人', width: '220'},
      ],
      select: {
        'select': listProduct,
        'queryParam': { dr: 0 }
      },
      top_btn: [
      ],
      act_btn: [
        {name: '查看',code: 'LOOKUP'},
      ],
      replace: [
        {name: 'valid',replace: {0:"启用",1:"禁用"}}
      ]
    }
  },
  methods: {
    onButtonClick(param) { // 监控页面中所有的按钮点击事件
      if (param.btnCode === 'LOOKUP') {
        this.openContent('查看', null)
      }
    },
    openContent(title, action) { // 打开内容界面Dialog
      this.content.visiable = true
      this.content.title = title
      this.content.action = action
    },
    closeContent(tempData) { // 关闭内容界面Dialog
      this.content.visiable = false
    }
  }
}
</script>

<style>

</style>