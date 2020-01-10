package cn.hups.productMageMent.dao;


import cn.hups.productMageMent.po.BillingPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfBillingMapperExpand {
    /**
     * 根据主键集合删除开票信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteBillingByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中开票数据数量
     * @param billingPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("billingPo") BillingPo billingPo) throws SQLException;

    /**
     * 分页查询所有开票信息
     * @param billingPo
     * @return
     * @throws SQLException
     */
    List<BillingPo> selectAllBillingAsPage(@Param("billingPo")BillingPo billingPo) throws SQLException;

}