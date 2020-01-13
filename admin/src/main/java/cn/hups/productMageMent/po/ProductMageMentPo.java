package cn.hups.productMageMent.po;

import cn.hups.salemage.entity.BdProduct;

/**
 * 综合管理汇总PO
 */
public class ProductMageMentPo extends BdProduct {
    // 产品信息PO类


    // 客户信息PO类

    //客户等级
    private Integer customerClass;
    //客户名称
    private String customerName;
    //客户编码
    private String customerCode;
    //企业名称
    private String customerCorpname;
    //企业地址
    private String corpaddress;
    //销售负责人
    private String psnname;
    //企业电话
    private String tel;
    //采购联系人
    private String customname;
    //采购联系电话
    private String telnum;


    //发票相关PO类
    private String corpname;
    private String dutynum;
    private String invoiceAddress;
    private String invoiceTel;
    private String invoiceBank;
    private String invoiceAccount;
    private String addressee;
    private String addresseeTel;
    private String addresseeAdrs;



    //销售相关PO类

    public Integer getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(Integer customerClass) {
        this.customerClass = customerClass;
    }

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

    public String getCustomerCorpname() {
        return customerCorpname;
    }

    public void setCustomerCorpname(String customerCorpname) {
        this.customerCorpname = customerCorpname;
    }

    public String getCorpaddress() {
        return corpaddress;
    }

    public void setCorpaddress(String corpaddress) {
        this.corpaddress = corpaddress;
    }

    public String getPsnname() {
        return psnname;
    }

    public void setPsnname(String psnname) {
        this.psnname = psnname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getCorpname() {
        return corpname;
    }

    public void setCorpname(String corpname) {
        this.corpname = corpname;
    }

    public String getDutynum() {
        return dutynum;
    }

    public void setDutynum(String dutynum) {
        this.dutynum = dutynum;
    }

    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    public void setInvoiceAddress(String invoiceAddress) {
        this.invoiceAddress = invoiceAddress;
    }

    public String getInvoiceTel() {
        return invoiceTel;
    }

    public void setInvoiceTel(String invoiceTel) {
        this.invoiceTel = invoiceTel;
    }

    public String getInvoiceBank() {
        return invoiceBank;
    }

    public void setInvoiceBank(String invoiceBank) {
        this.invoiceBank = invoiceBank;
    }

    public String getInvoiceAccount() {
        return invoiceAccount;
    }

    public void setInvoiceAccount(String invoiceAccount) {
        this.invoiceAccount = invoiceAccount;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getAddresseeTel() {
        return addresseeTel;
    }

    public void setAddresseeTel(String addresseeTel) {
        this.addresseeTel = addresseeTel;
    }

    public String getAddresseeAdrs() {
        return addresseeAdrs;
    }

    public void setAddresseeAdrs(String addresseeAdrs) {
        this.addresseeAdrs = addresseeAdrs;
    }
}
