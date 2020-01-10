package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfBilling;
import cn.hups.productMageMent.entity.WfBillingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfBillingMapper {
    int countByExample(WfBillingExample example);

    int deleteByExample(WfBillingExample example);

    int deleteByPrimaryKey(Integer pkBilling);

    int insert(WfBilling record);

    int insertSelective(WfBilling record);

    List<WfBilling> selectByExample(WfBillingExample example);

    WfBilling selectByPrimaryKey(Integer pkBilling);

    int updateByExampleSelective(@Param("record") WfBilling record, @Param("example") WfBillingExample example);

    int updateByExample(@Param("record") WfBilling record, @Param("example") WfBillingExample example);

    int updateByPrimaryKeySelective(WfBilling record);

    int updateByPrimaryKey(WfBilling record);
}