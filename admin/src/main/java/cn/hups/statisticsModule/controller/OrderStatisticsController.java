package cn.hups.statisticsModule.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.statisticsModule.po.OrderStatisticsPo;
import cn.hups.statisticsModule.service.IOrderStatistcsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 客户产品订单Controller
 */
@RestController
@RequestMapping("/orderStatistics")
public class OrderStatisticsController {
    @Resource
    IOrderStatistcsService iOrderStatistcsService;
    /**
     * 根据订单主键查询相关参照信息
     * @param orderStatisticsPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllOrderProductAsRef")
    public AjaxJson selectAllOrderProductBAsRef(@RequestBody OrderStatisticsPo orderStatisticsPo) throws GlobalException {
        return iOrderStatistcsService.selectAllOrderProductBAsRef(orderStatisticsPo);
    }

}
