<template>
  <div>
    <el-form-item label="客户编码">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="客户名称">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="客户简称">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="客户等级">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="销售员">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="采购联系人">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="采购电话">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="收货地址">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="客户座机">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>

    <el-form-item label="开票信息">
      <el-input v-model="tempData.customerName"></el-input>
    </el-form-item>
  </div>
</template>

<script>
export default {
  name: 'CustomerInfoCard',
  props: ["tempData"],
  data() {
    return {

    }
  },
  created() {
    console.log(this.tempData)
    debugger
  },
  methods: {

  }
}
</script>

<style>

</style>