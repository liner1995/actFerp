package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.po.ProcurementPo;
import cn.hups.productMageMent.po.ProductionPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfProcurmentMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteProcurmentByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param procurementPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("procurementPo")ProcurementPo procurementPo) throws SQLException;

    /**
     * 分页查询所有产品信息
     * @param procurementPo
     * @return
     * @throws SQLException
     */
    List<ProcurementPo> selectAllProcurmentAsPage(@Param("procurementPo")ProcurementPo procurementPo) throws SQLException;
}
