package cn.hups.productionProccessMent.po;

import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.salemage.po.BdProductPo;

import java.util.List;

/**
 * 生产流程 综合管理界面中的列表订单数据拓展PO
 */
public class OrderMageMentPo extends BillProductOrderHPo {

    //采购联系人
    private String purchaseContactsName;

    //采购联系电话
    private String purchaseContactsTel;

    //技术联系人
    private String skillContactsName;

    //技术联系电话
    private String skillContactsTel;

    //收货地址
    private String address;

    //收货人id
    private String takeoverPsn;

    //收货人姓名
    private String customname;

    //收货电话
    private String takeoverTel;

    // 产品信息PO类
    private List<BdProductPo> productInfoList;

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname;
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



    public List<BdProductPo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<BdProductPo> productInfoList) {
        this.productInfoList = productInfoList;
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
}
