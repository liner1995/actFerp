package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.DipProductionPo;


/**
 * DIP生产服务类
 */
public interface IDipProductionService {
    /**
     * 分页查询所有DIP生产信息
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllDipProductionAsPage(DipProductionPo dipProductionPo) throws GlobalException;
    /**
     * 添加DIP生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertDipProduction(DipProductionPo dipProductionPo)throws GlobalException;

    /**
     * 修改DIP生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateDipProduction(DipProductionPo dipProductionPo)throws GlobalException;

    /**
     * 根据主键删除DIP生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteDipProductionByPks(DipProductionPo dipProductionPo)throws GlobalException;
}
