package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfProcurement;
import cn.hups.productMageMent.entity.WfProcurementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfProcurementMapper {
    int countByExample(WfProcurementExample example);

    int deleteByExample(WfProcurementExample example);

    int deleteByPrimaryKey(Integer pkProcurement);

    int insert(WfProcurement record);

    int insertSelective(WfProcurement record);

    List<WfProcurement> selectByExample(WfProcurementExample example);

    WfProcurement selectByPrimaryKey(Integer pkProcurement);

    int updateByExampleSelective(@Param("record") WfProcurement record, @Param("example") WfProcurementExample example);

    int updateByExample(@Param("record") WfProcurement record, @Param("example") WfProcurementExample example);

    int updateByPrimaryKeySelective(WfProcurement record);

    int updateByPrimaryKey(WfProcurement record);
}