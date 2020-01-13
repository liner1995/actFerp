package cn.hups.productionProccessMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productionProccessMent.po.OrderMageMentPo;

/**
 * 生产流程综合管理 Service
 */
public interface IProductionProcessService {

    /**
     * 生产流程综合管理界面 数据查询
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllOrderInfoAsPage(OrderMageMentPo orderMageMentPo) throws GlobalException;

    /**
     * 根据订单主键查询 生产流程综合管理中所需的数据
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectOrderDetailsByPrimary(OrderMageMentPo orderMageMentPo) throws GlobalException;

}
