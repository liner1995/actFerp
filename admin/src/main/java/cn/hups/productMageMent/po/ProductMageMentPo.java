package cn.hups.productMageMent.po;

import cn.hups.customer.po.BdCustomerPo;
import cn.hups.salemage.po.BdProductPo;

/**
 * 综合管理汇总PO
 */
public class ProductMageMentPo {
    // 产品信息PO类
    private BdProductPo productInfo;

    // 客户信息PO类
    private BdCustomerPo customerInfo;

    public BdProductPo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(BdProductPo productInfo) {
        this.productInfo = productInfo;
    }

    public BdCustomerPo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(BdCustomerPo customerInfo) {
        this.customerInfo = customerInfo;
    }
}
