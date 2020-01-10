package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfMaterialQc;
import cn.hups.productMageMent.entity.WfMaterialQcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfMaterialQcMapper {
    int countByExample(WfMaterialQcExample example);

    int deleteByExample(WfMaterialQcExample example);

    int deleteByPrimaryKey(Integer pkMaterialQc);

    int insert(WfMaterialQc record);

    int insertSelective(WfMaterialQc record);

    List<WfMaterialQc> selectByExample(WfMaterialQcExample example);

    WfMaterialQc selectByPrimaryKey(Integer pkMaterialQc);

    int updateByExampleSelective(@Param("record") WfMaterialQc record, @Param("example") WfMaterialQcExample example);

    int updateByExample(@Param("record") WfMaterialQc record, @Param("example") WfMaterialQcExample example);

    int updateByPrimaryKeySelective(WfMaterialQc record);

    int updateByPrimaryKey(WfMaterialQc record);
}