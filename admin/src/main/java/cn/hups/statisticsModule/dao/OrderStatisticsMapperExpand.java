package cn.hups.statisticsModule.dao;

import cn.hups.orderCustomer.po.BdOrderProductPo;
import cn.hups.orderCustomer.po.BillProductOrderHPo;
import cn.hups.statisticsModule.po.OrderStatisticsPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 客户产品订单主表拓展Mapper
 */
public interface OrderStatisticsMapperExpand {

    /**
     * 根据订单主键查询相关参照
     * @param orderStatisticsPo
     * @return
     * @throws SQLException
     */
    OrderStatisticsPo selectAllOrderProductBAsRef(@Param("orderStatisticsPo") OrderStatisticsPo orderStatisticsPo) throws SQLException;



}
