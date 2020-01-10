package cn.hups.productMageMent.dao;


import cn.hups.productMageMent.po.MaterialQcPo;
import cn.hups.productMageMent.po.SmtProductionPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfSmtProductionMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteSmtProductionByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param smtProductionPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("smtProductionPo")SmtProductionPo smtProductionPo) throws SQLException;

    /**
     * 分页查询所有产品信息
     * @param smtProductionPo
     * @return
     * @throws SQLException
     */
    List<SmtProductionPo> selectAllSmtProductionAsPage(@Param("smtProductionPo")SmtProductionPo smtProductionPo) throws SQLException;
}