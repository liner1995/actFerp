package cn.hups.productMageMent.dao;

import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.po.WarehousingPo;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

public interface WfWarehousingMapperExpand {
    /**
     * 根据主键集合删除产品信息
     * @param pkArr
     * @return
     * @throws SQLException
     */
    int deleteWarehousingByPs(@Param("pkArr") List<Integer> pkArr) throws SQLException;

    /**
     * 查询表中数据数量
     * @param warehousingPo
     * @return
     * @throws SQLException
     */
    Long countData(@Param("warehousingPo") WarehousingPo warehousingPo) throws SQLException;

    /**
     * 分页查询所有入库信息
     * @param warehousingPo
     * @return
     * @throws SQLException
     */
    List<WarehousingPo> selectAllWarehousingPoAsPage(@Param("warehousingPo") WarehousingPo warehousingPo) throws SQLException;

}