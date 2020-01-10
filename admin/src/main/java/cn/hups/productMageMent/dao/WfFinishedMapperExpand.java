package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.po.FinishedPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfFinishedMapperExpand {

    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteFinishedByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询成品质检数据数量
     * @param finishedPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("finishedPo") FinishedPo finishedPo ) throws SQLException;

    /**
     * 分页查询所有成品质检信息
     * @param finishedPo
     * @return
     * @throws SQLException
     */
    List<FinishedPo> selectAllFinishedAsPage(@Param("finishedPo") FinishedPo finishedPo) throws SQLException;

}