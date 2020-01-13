package cn.hups.statisticsModule.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;

/**
 * 统计模块 接口
 */
public interface IStatisticsService {

    /**
     * 客户明细报表统计明细查询
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllCustomerCensusAsPage() throws GlobalException;

    /**
     * 产品信息统计报表查询
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProductCensusAsPage() throws GlobalException;
}
