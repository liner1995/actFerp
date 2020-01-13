package cn.hups.statisticsModule.service.impl;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.statisticsModule.service.IStatisticsService;
import org.springframework.stereotype.Service;

/**
 * 统计模块实现类
 */
@Service("iStatisticsService")
public class StatisticsServiceImpl implements IStatisticsService {

    /**
     * 客户明细报表统计明细查询
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomerCensusAsPage() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        return ajaxJson;
    }

    /**
     * 产品信息统计报表查询
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllProductCensusAsPage() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        return ajaxJson;
    }
}
