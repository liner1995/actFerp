package cn.hups.orderCustomer.po;

import cn.hups.orderCustomer.entity.BillProductOrderH;

import java.util.List;

/**
 * 订单信息表头拓展PO
 */
public class BillProductOrderHPo extends BillProductOrderH {

    // 供料方式显示名称
    private String materialSourceShow;

    // 是否加急显示名称
    private String urgentShow;

    // 运输方式显示名称
    private String transportTypeShow;

    // 付款方式显示名称
    private String paymentTypeShow;

    // 客户编号
    private String customerCode;

    // 销售负责人显示名称
    private String pkPsndocShow;

    // 子表数据
    private List<BillProductOrderBPo> billProductOrderBPoList;



    public String getMaterialSourceShow() {
        return materialSourceShow;
    }

    public void setMaterialSourceShow(String materialSourceShow) {
        this.materialSourceShow = materialSourceShow;
    }

    public String getUrgentShow() {
        return urgentShow;
    }

    public void setUrgentShow(String urgentShow) {
        this.urgentShow = urgentShow;
    }

    public String getTransportTypeShow() {
        return transportTypeShow;
    }

    public void setTransportTypeShow(String transportTypeShow) {
        this.transportTypeShow = transportTypeShow;
    }

    public String getPaymentTypeShow() {
        return paymentTypeShow;
    }

    public void setPaymentTypeShow(String paymentTypeShow) {
        this.paymentTypeShow = paymentTypeShow;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getPkPsndocShow() {
        return pkPsndocShow;
    }

    public void setPkPsndocShow(String pkPsndocShow) {
        this.pkPsndocShow = pkPsndocShow;
    }

    public List<BillProductOrderBPo> getBillProductOrderBPoList() {
        return billProductOrderBPoList;
    }

    public void setBillProductOrderBPoList(List<BillProductOrderBPo> billProductOrderBPoList) {
        this.billProductOrderBPoList = billProductOrderBPoList;
    }


}
