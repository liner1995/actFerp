package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfSmtProduction;
import cn.hups.productMageMent.entity.WfSmtProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfSmtProductionMapper {
    int countByExample(WfSmtProductionExample example);

    int deleteByExample(WfSmtProductionExample example);

    int deleteByPrimaryKey(Integer pkSmtProduction);

    int insert(WfSmtProduction record);

    int insertSelective(WfSmtProduction record);

    List<WfSmtProduction> selectByExample(WfSmtProductionExample example);

    WfSmtProduction selectByPrimaryKey(Integer pkSmtProduction);

    int updateByExampleSelective(@Param("record") WfSmtProduction record, @Param("example") WfSmtProductionExample example);

    int updateByExample(@Param("record") WfSmtProduction record, @Param("example") WfSmtProductionExample example);

    int updateByPrimaryKeySelective(WfSmtProduction record);

    int updateByPrimaryKey(WfSmtProduction record);
}