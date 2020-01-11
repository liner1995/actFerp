package cn.hups.statisticsModule.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.statisticsModule.po.OrderStatisticsPo;

import java.sql.SQLException;

public interface IOrderStatistcsService {
    /**
     * 根据订单主键查询订参照信息
     * @param orderStatisticsPo
     * @return
     * @throws SQLException
     */
    AjaxJson selectAllOrderProductBAsRef(OrderStatisticsPo orderStatisticsPo)throws GlobalException;
}
