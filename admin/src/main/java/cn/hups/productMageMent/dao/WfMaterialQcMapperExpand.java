package cn.hups.productMageMent.dao;


import cn.hups.productMageMent.po.MaterialQcPo;

import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfMaterialQcMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteMaterialQcByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param materialQcPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("materialQcPo")MaterialQcPo materialQcPo) throws SQLException;

    /**
     * 分页查询所有产品信息
     * @param materialQcPo
     * @return
     * @throws SQLException
     */
    List<MaterialQcPo> selectAllMaterialQcAsPage(@Param("materialQcPo")MaterialQcPo materialQcPo) throws SQLException;
}