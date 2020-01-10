package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProcurementPo;


public interface IProcurementService {

    /**
     * 分页查询所有采购信息
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllProcurementAsPage(ProcurementPo procurementPo) throws GlobalException;
    /**
     * 添加采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertProcurement(ProcurementPo procurementPo)throws GlobalException;

    /**
     * 修改采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateProcurement(ProcurementPo procurementPo)throws GlobalException;

    /**
     * 根据主键删除采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteProcurementByPks(ProcurementPo procurementPo)throws GlobalException;
}
