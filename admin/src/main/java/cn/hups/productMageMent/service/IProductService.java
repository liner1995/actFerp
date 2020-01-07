package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.salemage.po.BdProductPo;

/**
 * 订单相关
 */
public interface IProductService {

    /**
     * 根据订单主键信息查询产品作为参照
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectProductCustomerByPkProductAsRef (BdProductPo bdProductPo) throws GlobalException;

    /**
     * 分页查询订单信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectProductCustomerAsPage (BdProductPo bdProductPo) throws GlobalException;
}
