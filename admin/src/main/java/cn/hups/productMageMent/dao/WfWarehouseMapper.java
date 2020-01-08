package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.entity.WfWarehouse;
import cn.hups.productMageMent.entity.WfWarehouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WfWarehouseMapper {
    int countByExample(WfWarehouseExample example);

    int deleteByExample(WfWarehouseExample example);

    int deleteByPrimaryKey(Integer pkWarehouse);

    int insert(WfWarehouse record);

    int insertSelective(WfWarehouse record);

    List<WfWarehouse> selectByExample(WfWarehouseExample example);

    WfWarehouse selectByPrimaryKey(Integer pkWarehouse);

    int updateByExampleSelective(@Param("record") WfWarehouse record, @Param("example") WfWarehouseExample example);

    int updateByExample(@Param("record") WfWarehouse record, @Param("example") WfWarehouseExample example);

    int updateByPrimaryKeySelective(WfWarehouse record);

    int updateByPrimaryKey(WfWarehouse record);
}