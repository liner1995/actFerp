package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.po.WarehousePo;

public interface IWarehouseService {

    /**
     * 分页查询所有库房信息
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllWarehousePoAsPage(WarehousePo warehousePo) throws GlobalException;
    /**
     * 添加库房备料
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertWarehouse(WarehousePo warehousePo) throws GlobalException;

    /**
     * 修改生产计划
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateWarehouse(WarehousePo warehousePo)throws GlobalException;

    /**
     * 根据主键删除生产计划
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteWarehouseByPks(WarehousePo warehousePo)throws GlobalException;

}
