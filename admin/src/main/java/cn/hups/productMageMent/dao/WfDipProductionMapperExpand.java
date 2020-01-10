package cn.hups.productMageMent.dao;


import cn.hups.productMageMent.po.DipProductionPo;
import cn.hups.productMageMent.po.MaterialQcPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfDipProductionMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteDipProductionByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param dipProductionPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("dipProductionPo") DipProductionPo dipProductionPo) throws SQLException;

    /**
     * 分页查询所有产品信息
     * @param dipProductionPo
     * @return
     * @throws SQLException
     */
    List<DipProductionPo> selectAllDipProductionAsPage(@Param("dipProductionPo")DipProductionPo dipProductionPo) throws SQLException;

}