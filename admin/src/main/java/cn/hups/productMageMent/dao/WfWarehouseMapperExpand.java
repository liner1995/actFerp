package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.po.WarehousePo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfWarehouseMapperExpand {

    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteWarehouseByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 根据主键集合修改状态信息
     * @param warehousePo
     * @return
     * @throws SQLException
     */
    int updateWarehouseStartByPs(@Param("warehousePo") WarehousePo warehousePo,@Param("pkArr") List<Integer> pkArr) throws SQLException;



    /**
     * 查询表中数据数量
     * @param warehousePo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("warehousePo") WarehousePo warehousePo) throws SQLException;

    /**
     * 分页查询所有仓库信息
     * @param warehousePo
     * @return
     * @throws SQLException
     */
    List<WarehousePo> selectAllWarehousePoAsPage(@Param("warehousePo") WarehousePo warehousePo) throws SQLException;
}


