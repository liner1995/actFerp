package cn.hups.productionProccessMent.po;

import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.salemage.po.BdProductPo;

import java.util.List;

/**
 * 生产流程 综合管理界面中的列表订单数据拓展PO
 */
public class OrderMageMentPo extends BillProductOrderHPo {

    // 产品信息PO类
    private List<BdProductPo> productInfoList;

    public List<BdProductPo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<BdProductPo> productInfoList) {
        this.productInfoList = productInfoList;
    }
}
