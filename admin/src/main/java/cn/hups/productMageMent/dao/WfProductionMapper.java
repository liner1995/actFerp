package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfProduction;
import cn.hups.productMageMent.entity.WfProductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfProductionMapper {
    int countByExample(WfProductionExample example);

    int deleteByExample(WfProductionExample example);

    int deleteByPrimaryKey(Integer pkProduction);

    int insert(WfProduction record);

    int insertSelective(WfProduction record);

    List<WfProduction> selectByExample(WfProductionExample example);

    WfProduction selectByPrimaryKey(Integer pkProduction);

    int updateByExampleSelective(@Param("record") WfProduction record, @Param("example") WfProductionExample example);

    int updateByExample(@Param("record") WfProduction record, @Param("example") WfProductionExample example);

    int updateByPrimaryKeySelective(WfProduction record);

    int updateByPrimaryKey(WfProduction record);
}