<template>
    <div>
        <div class="handle-box">
            <div class="listname">
                <el-button type="primary" @click="restTemp">录入</el-button>
            </div>
            <div class="listname">
                <el-button type="primary" @click="deleteOrderPlan">删除</el-button>
            </div>
            <div class="listname">
                <el-button type="primary">打印</el-button>
            </div>
            <div class="listname">
                <el-button type="primary">导出</el-button>
            </div>
            <div class="listname">
                <el-button type="primary">暂停</el-button>
            </div>
            <div class="listname">
                <el-button type="primary">记录</el-button>
            </div>
        </div>
    <el-table
      :data="tableData"
      border
      @selection-change="handleSelectionChange"
      style="width: 100%"
    >
      <el-table-column type="selection" width="55"></el-table-column>
      <el-table-column label="序号" width="70px" fixed="left">
        <template slot-scope="scope">{{scope.$index+1}}</template>
      </el-table-column>
      <el-table-column prop="qcState" label="质检状态" width="85"></el-table-column>
      <el-table-column prop="qcExplain" label="质检说明" width="85"></el-table-column>
      <el-table-column prop="filename" label="附件名称" width="180"></el-table-column>
      <el-table-column prop="creator" label="经办人" width="180"></el-table-column>
      <el-table-column prop="creationtime" label="经办日期" width="85"></el-table-column>
      <el-table-column label="操作" fixed="right" >
      <template slot-scope="scope">
        <el-button
          size="mini"
          @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
      </template>
    </el-table-column>
    </el-table>
    <div class="fenye">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage4"
        :page-sizes="[10,20,30]"
        :page-size="limit"
        layout="total, sizes, prev, pager, next, jumper"
        :total="count"
      ></el-pagination>
    </div>                
    </div>
</template>
<script>
export default {
    
}
</script>