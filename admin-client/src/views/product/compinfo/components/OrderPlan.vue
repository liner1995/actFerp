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
    <Testinfolistcontent 
      :replace="replace"
      :visiable="content.visiable" 
      :title="content.title"
      :action="content.action"
      :updateRow="content.updateRow"
      @queryListData="queryListData"
      @close="closeContent">
    </Testinfolistcontent>
  </div>

    
</template>
<script>
import Table from '@/components/viewcomp/Table'
import {listProduction,insertProduction,deleteProductionByPks,updateProduction} from '@/api/productMageMent/productMageMent'
export default {
    name:"orderPlan",
    components: { Table,Testinfolistcontent },
  data() {
    return {
        content: {
        visiable: false, // 内容界面显示控制
        title: '', // 标题
        action: null, // 执行Action
        updateRow: null // 更新时带过来的temp
      },
      columns: [
        {prop: 'pkProduction', label: '主键', width: '10', primary: true},
        {prop: 'process', label: '工序', width: '120', fixedLeft: true},
        {prop: 'workshop', label: '生产车间', width: '120'},
        {prop: 'estimatedStartTime', label: '预计开工时间', width: '200'},
        {prop: 'estimatedEndTime', label: '预计完工时间', width: '200'},
        {prop: 'estimatedNumber', label: '预计数量', width: '120'},
        {prop: 'actualStartTime', label: '实际开工时间', width: '200'},
        {prop: 'actualEndTime', label: '实际结束时间', width: '200'},
        {prop: 'actualNumber', label: '实际数量', width: '120'},
      ],
      select: {
        'select': listProduction,
        'queryParam': {dr: 0 }
      },
      top_btn: [
        {name: '录入',code: 'ADD',action: insertProduction},
        {name: '删除',code: 'DEL',action: deleteProductionByPks},
        {name: '修改',code: 'UPDATE',action: updateProduction}
      ],

      replace: [
      ]
    }
  },
  methods: {
    onButtonClick(param) { // 监控页面中所有的按钮点击事件
      // 录入
      if (param.btnCode === 'ADD') {
        this.openContent('录入', param.btnAction)
      }
      // 修改
      //if (param.btnCode === 'UPDATE') {
       // this.openContent('修改', param.btnAction)
       // this.content.updateRow = param.bindData
      //}
    }
  }
}
    

</script>