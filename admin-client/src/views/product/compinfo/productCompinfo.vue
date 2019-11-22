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
import { listSmBtn, addSmBtn, updateSmBtn, deleteSmBtnByPks } from '@/api/rbac/smbtn'

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
        {prop: 'pkBtn', label: '主键', width: '10', primary: true},
      ],
      select: {
        'select': listSmBtn
      },
      top_btn: [
        {name: '录入',code: 'ADD',action: addSmBtn}
      ],
      act_btn: [
        {name: '修改',code: 'UPDATE',action: updateSmBtn},
        {name: '删除',code: 'DELETE',action: deleteSmBtnByPks}
      ],
      replace: [
        {name: 'valid',replace: {0:"启用",1:"禁用"}}
      ]
    }
  },
  methods: {
    onButtonClick(param) { // 监控页面中所有的按钮点击事件
      if (param.btnCode === 'ADD') {
        this.openContent('录入', param.btnAction)
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