package cn.hups.statisticsModule.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.statisticsModule.service.IStatisticsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 统计模块 controller
 */
@RestController
@RequestMapping("/sysStatisticsController")
public class StatisticsController {

    @Resource
    private IStatisticsService iStatisticsService;

    /**
     * 客户明细报表统计明细查询
     * @return
     * @Param 待定
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomerCensusAsPage() throws GlobalException {
        return iStatisticsService.selectAllCustomerCensusAsPage();
    }

    /**
     * 产品信息统计报表查询
     * @return
     * @Param 待定
     * @throws GlobalException
     */
    public AjaxJson selectAllProductCensusAsPage() throws GlobalException {
        return iStatisticsService.selectAllProductCensusAsPage();
    }
}
