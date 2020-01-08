package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.po.ProductionPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 生产计划扩展mapper
 */
public interface WfProductionMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteProductionByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param productionPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("productionPo") ProductionPo productionPo) throws SQLException;

    /**
     * 分页查询所有产品信息
     * @param productionPo
     * @return
     * @throws SQLException
     */
    List<ProductionPo> selectAllProductionAsPage(@Param("productionPo") ProductionPo productionPo) throws SQLException;
}
