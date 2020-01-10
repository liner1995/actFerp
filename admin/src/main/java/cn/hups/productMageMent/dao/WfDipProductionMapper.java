package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfDipProduction;
import cn.hups.productMageMent.entity.WfDipProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfDipProductionMapper {
    int countByExample(WfDipProductionExample example);

    int deleteByExample(WfDipProductionExample example);

    int deleteByPrimaryKey(Integer pkDipProduction);

    int insert(WfDipProduction record);

    int insertSelective(WfDipProduction record);

    List<WfDipProduction> selectByExample(WfDipProductionExample example);

    WfDipProduction selectByPrimaryKey(Integer pkDipProduction);

    int updateByExampleSelective(@Param("record") WfDipProduction record, @Param("example") WfDipProductionExample example);

    int updateByExample(@Param("record") WfDipProduction record, @Param("example") WfDipProductionExample example);

    int updateByPrimaryKeySelective(WfDipProduction record);

    int updateByPrimaryKey(WfDipProduction record);
}