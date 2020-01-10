package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.po.SmtProductionPo;

/**
 * SMT生产服务类
 */
public interface ISmtProductionService {
    /**
     * 分页查询所有SMT生产信息
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmtProductionAsPage(SmtProductionPo smtProductionPo) throws GlobalException;
    /**
     * 添加SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSmtProduction(SmtProductionPo smtProductionPo)throws GlobalException;

    /**
     * 修改SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSmtProduction(SmtProductionPo smtProductionPo)throws GlobalException;

    /**
     * 根据主键删除SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSmtProductionByPks(SmtProductionPo smtProductionPo)throws GlobalException;
}
