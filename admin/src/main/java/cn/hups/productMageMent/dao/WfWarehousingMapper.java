package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfWarehousing;
import cn.hups.productMageMent.entity.WfWarehousingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfWarehousingMapper {
    int countByExample(WfWarehousingExample example);

    int deleteByExample(WfWarehousingExample example);

    int deleteByPrimaryKey(Integer pkWarehousing);

    int insert(WfWarehousing record);

    int insertSelective(WfWarehousing record);

    List<WfWarehousing> selectByExample(WfWarehousingExample example);

    WfWarehousing selectByPrimaryKey(Integer pkWarehousing);

    int updateByExampleSelective(@Param("record") WfWarehousing record, @Param("example") WfWarehousingExample example);

    int updateByExample(@Param("record") WfWarehousing record, @Param("example") WfWarehousingExample example);

    int updateByPrimaryKeySelective(WfWarehousing record);

    int updateByPrimaryKey(WfWarehousing record);
}