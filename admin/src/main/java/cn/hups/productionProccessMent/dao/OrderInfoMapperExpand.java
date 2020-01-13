package cn.hups.productionProccessMent.dao;

import cn.hups.productionProccessMent.po.OrderMageMentPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 生产流程订单列表查询拓展Mapper
 */
public interface OrderInfoMapperExpand {

    /**
     * 查询表中数据数量
     * @param orderMageMentPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("orderMageMentPo") OrderMageMentPo orderMageMentPo) throws SQLException;

    /**
     * 分页查询订单表数据
     * @param orderMageMentPo
     * @return
     * @throws SQLException
     */
    List<OrderMageMentPo> selectAllOrderInfoAsPage(@Param("orderMageMentPo") OrderMageMentPo orderMageMentPo) throws SQLException;

    /**
     * 根据订单主键查询 生产流程综合管理中所需的数据
     * @param orderMageMentPo
     * @return
     * @throws SQLException
     */
    OrderMageMentPo selectOrderDetailsByPrimary(@Param("orderMageMentPo") OrderMageMentPo orderMageMentPo) throws SQLException;
}
