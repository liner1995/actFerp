package cn.hups.statisticsModule.po;

import cn.hups.orderCustomer.entity.BillProductOrderH;

/**
 * 订单统计扩展po
 */
public class OrderStatisticsPo extends BillProductOrderH {
    // 客户名称
    private String customerName;

    // 客户编码
    private String customerCode;

    // 客户联系方式
    private String customerTel;

    // 客户公司地址
    private String corpaddress;

    //产品编号
    private String productCode;

    //产品名称
    private String productName;

    //产品型号
    private String productModel;

    //订单数量
    private String orderNumber;

    //采购联系人
    private String purchaseContactsName;

    //采购联系电话
    private String purchaseContactsTel;

    //技术联系人
    private String skillContactsName;

    //技术联系电话
    private String skillContactsTel;

    //是否组装
    private String isinstal;

    //是否测试
    private String istest;

    //是否老化
    private String isaging;

    //是否三防
    private String defense;

    //焊接工艺
    private String sealTechnics;

    //DIP治具
    private String makeDip;

    //测试治具
    private String makeTest;

    //老化治具
    private String makeAging;

    //三防治具
    private String makeDefense;

    //执行标准
    private String exeStandard;

    //钢网来源
    private String steelMeshSource;

    //PCB来源
    private String pcbSource;

    //物料来源
    private String materialSource;

    //收货地址
    private String address;

    //收货人
    private String takeoverPsn;

    //收货电话
    private String takeoverTel;

    //销售负责人
    private String psnname;

    //采购人对应主键
    private Integer purchaseContacts;

    //技术人对应主键
    private Integer skillContacts;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public String getCorpaddress() {
        return corpaddress;
    }

    public void setCorpaddress(String corpaddress) {
        this.corpaddress = corpaddress;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPurchaseContactsName() {
        return purchaseContactsName;
    }

    public void setPurchaseContactsName(String purchaseContactsName) {
        this.purchaseContactsName = purchaseContactsName;
    }

    public String getPurchaseContactsTel() {
        return purchaseContactsTel;
    }

    public void setPurchaseContactsTel(String purchaseContactsTel) {
        this.purchaseContactsTel = purchaseContactsTel;
    }

    public String getSkillContactsName() {
        return skillContactsName;
    }

    public void setSkillContactsName(String skillContactsName) {
        this.skillContactsName = skillContactsName;
    }

    public String getSkillContactsTel() {
        return skillContactsTel;
    }

    public void setSkillContactsTel(String skillContactsTel) {
        this.skillContactsTel = skillContactsTel;
    }

    public String getIsinstal() {
        return isinstal;
    }

    public void setIsinstal(String isinstal) {
        this.isinstal = isinstal;
    }

    public String getIstest() {
        return istest;
    }

    public void setIstest(String istest) {
        this.istest = istest;
    }

    public String getIsaging() {
        return isaging;
    }

    public void setIsaging(String isaging) {
        this.isaging = isaging;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSealTechnics() {
        return sealTechnics;
    }

    public void setSealTechnics(String sealTechnics) {
        this.sealTechnics = sealTechnics;
    }

    public String getMakeDip() {
        return makeDip;
    }

    public void setMakeDip(String makeDip) {
        this.makeDip = makeDip;
    }

    public String getMakeTest() {
        return makeTest;
    }

    public void setMakeTest(String makeTest) {
        this.makeTest = makeTest;
    }

    public String getMakeAging() {
        return makeAging;
    }

    public void setMakeAging(String makeAging) {
        this.makeAging = makeAging;
    }

    public String getMakeDefense() {
        return makeDefense;
    }

    public void setMakeDefense(String makeDefense) {
        this.makeDefense = makeDefense;
    }

    public String getExeStandard() {
        return exeStandard;
    }

    public void setExeStandard(String exeStandard) {
        this.exeStandard = exeStandard;
    }

    public String getSteelMeshSource() {
        return steelMeshSource;
    }

    public void setSteelMeshSource(String steelMeshSource) {
        this.steelMeshSource = steelMeshSource;
    }

    public String getPcbSource() {
        return pcbSource;
    }

    public void setPcbSource(String pcbSource) {
        this.pcbSource = pcbSource;
    }

    @Override
    public String getMaterialSource() {
        return materialSource;
    }

    @Override
    public void setMaterialSource(String materialSource) {
        this.materialSource = materialSource;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTakeoverPsn() {
        return takeoverPsn;
    }

    public void setTakeoverPsn(String takeoverPsn) {
        this.takeoverPsn = takeoverPsn;
    }

    public String getTakeoverTel() {
        return takeoverTel;
    }

    public void setTakeoverTel(String takeoverTel) {
        this.takeoverTel = takeoverTel;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname;
    }

    public Integer getPurchaseContacts() {
        return purchaseContacts;
    }

    public void setPurchaseContacts(Integer purchaseContacts) {
        this.purchaseContacts = purchaseContacts;
    }

    public Integer getSkillContacts() {
        return skillContacts;
    }

    public void setSkillContacts(Integer skillContacts) {
        this.skillContacts = skillContacts;
    }
}
