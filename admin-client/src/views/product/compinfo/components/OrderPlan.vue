<template>
  <div>
  <div class="handle-box">
				<div class="listname">
					 <el-button type="primary">录入</el-button>
				</div>
				<div class="listname">
					<el-button type="primary">修改</el-button>
				</div>
        <div class="listname">
					<el-button type="primary">删除</el-button>
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
    <el-table :data="tableData" border
      style="width: 100%">
      <el-table-column prop="pkProduction" label="主键" width="50"></el-table-column>
      <el-table-column prop="process" label="工序" width="120"></el-table-column>
      <el-table-column prop="workshop" label="生产车间" width="120"></el-table-column>
      <el-table-column prop="estimatedStartTime" label="预计开工时间" width="200"></el-table-column>
      <el-table-column prop="estimatedEndTime" label="预计完工时间" width="200"></el-table-column>
      <el-table-column prop="estimatedNumber" label="预计数量" width="120"></el-table-column>
      <el-table-column prop="actualStartTime" label="实际开工时间" width="200"></el-table-column>
      <el-table-column prop="actualEndTime" label="实际完工时间" width="200"></el-table-column>
      <el-table-column prop="actualNumber" label="实际数量" width="120"></el-table-column>
    </el-table>
    	<div class="fenye">
			  <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :current-page="currentPage4"
			 :page-sizes="[10,20,30]" :page-size="limit" layout="total, sizes, prev, pager, next, jumper" :total="count">
			</el-pagination>
		</div>
  </div>
 
  
</template>

<script>
import OrderPlancontent from "@/views/product/compinfo/content";
import {listProduction,insertProduction,deleteProductionByPks,updateProduction} from "@/api/productMageMent/productMageMent";
export default {
  name: "OrderPlan",
  data() {
    return {
        page: 0,
				limit: 10,
				count: 0,
				currentPage4: 1,
        tableData:[],
  }
  },
  created(){
    this.getdata()
  },
  methods:{
    getdata(){
      listProduction({
      page:this.page,
      limit:this.limit
      }).then(res=>{
          this.tableData=res.object;
          this.count=res.total;
      })
    },
    	handleSizeChange(val) {
				this.limit = val;
				this.getdata();
			},
			handleCurrentChange(val) {
				this.page = val;
				this.getdata();
			}
  }
};
</script>
<style scoped>
.handle-box {
		display: flex;
		overflow: hidden;
		justify-content: flex-start;
		flex-wrap: wrap;
		margin-bottom: 20px;
	}
  	.listname {
			display: flex;
			width: auto;
			align-items: center;
			justify-content: flex-start;
			margin-top: 0.9375rem;
			margin-left: 0.8rem;
		}
    	.allname {
				min-width: 3rem;
				color: #409EFF;
			}
</style>