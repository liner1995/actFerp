package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfFinished;
import cn.hups.productMageMent.entity.WfFinishedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfFinishedMapper {
    int countByExample(WfFinishedExample example);

    int deleteByExample(WfFinishedExample example);

    int deleteByPrimaryKey(Integer pkFinished);

    int insert(WfFinished record);

    int insertSelective(WfFinished record);

    List<WfFinished> selectByExample(WfFinishedExample example);

    WfFinished selectByPrimaryKey(Integer pkFinished);

    int updateByExampleSelective(@Param("record") WfFinished record, @Param("example") WfFinishedExample example);

    int updateByExample(@Param("record") WfFinished record, @Param("example") WfFinishedExample example);

    int updateByPrimaryKeySelective(WfFinished record);

    int updateByPrimaryKey(WfFinished record);
}