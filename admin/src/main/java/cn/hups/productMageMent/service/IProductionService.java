package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.salemage.po.BdProductPo;

/**
 * 生产计划相关
 */
public interface IProductionService {

    /**
     * 分页查询所有产品信息
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProductionAsPage(ProductionPo productionPo) throws GlobalException;
    /**
     * 添加生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertProduction(ProductionPo productionPo)throws GlobalException;

    /**
     * 修改生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateProduction(ProductionPo productionPo)throws GlobalException;

    /**
     * 根据主键删除生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteProductionByPks(ProductionPo productionPo)throws GlobalException;
}
