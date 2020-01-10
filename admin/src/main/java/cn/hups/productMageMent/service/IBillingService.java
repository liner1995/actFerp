package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.BillingPo;
import cn.hups.salemage.po.BdProductPo;

/**
 * 开票相关服务类
 */
public interface IBillingService {

    /**
     * 分页查询所有开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBillingAsPage(BillingPo billingPo) throws GlobalException;
    /**
     * 添加开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertBilling(BillingPo billingPo) throws GlobalException;

    /**
     * 修改开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateBilling(BillingPo billingPo)throws GlobalException;

    /**
     * 根据主键删除开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteBillingByPks(BillingPo billingPo)throws GlobalException;
}
