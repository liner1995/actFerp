package cn.hups.productionProccessMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productionProccessMent.po.OrderMageMentPo;
import cn.hups.productionProccessMent.service.IProductionProcessService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 生产流程综合管理 Controller
 */
@RestController
@RequestMapping("/productionProcessController")
public class ProductionProcessController {

    @Resource
    private IProductionProcessService iProductionProcessService;

    /**
     * 生产流程综合管理界面 数据查询
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllOrderInfoAsPage")
    public AjaxJson selectAllOrderInfoAsPage(@RequestBody OrderMageMentPo orderMageMentPo) throws GlobalException {
        return iProductionProcessService.selectAllOrderInfoAsPage(orderMageMentPo);
    }

    /**
     * 根据订单主键查询 生产流程综合管理中所需的数据
     * @param orderMageMentPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectOrderDetailsByPrimary")
    public AjaxJson selectOrderDetailsByPrimary(@RequestBody OrderMageMentPo orderMageMentPo) throws GlobalException {
        return iProductionProcessService.selectOrderDetailsByPrimary(orderMageMentPo);
    }
}
