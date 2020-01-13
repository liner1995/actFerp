package cn.hups.productionProccessMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productionProccessMent.dao.OrderInfoMapperExpand;
import cn.hups.productionProccessMent.po.OrderMageMentPo;
import cn.hups.productionProccessMent.service.IProductionProcessService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 生产流程综合管理 实现类
 */
@Service("iProductionProcessService")
public class ProductionProcessServiceImpl implements IProductionProcessService {

    @Resource
    private OrderInfoMapperExpand orderInfoMapperExpand;

    /**
     * 生产流程综合管理界面 数据查询
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllOrderInfoAsPage(OrderMageMentPo orderMageMentPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = orderInfoMapperExpand.countData(orderMageMentPo);
            List<OrderMageMentPo> resultList = orderInfoMapperExpand.selectAllOrderInfoAsPage(orderMageMentPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据订单主键查询 生产流程综合管理中所需的数据
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectOrderDetailsByPrimary(OrderMageMentPo orderMageMentPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (orderMageMentPo != null && orderMageMentPo.getPkProductOrder() != null) {
                OrderMageMentPo orderMageMentPo1 = orderInfoMapperExpand.selectOrderDetailsByPrimary(orderMageMentPo);
                ajaxJson.setObj(orderMageMentPo1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
