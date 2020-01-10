package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.FinishedPo;

/**
 * 成品质检服务类
 */
public interface IFinishedService {
    /**
     * 分页查询所有成品质检信息
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllFinishedAsPage(FinishedPo finishedPo) throws GlobalException;
    /**
     * 添加成品质检计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertFinished(FinishedPo finishedPo)throws GlobalException;

    /**
     * 修改成品质检计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateFinished(FinishedPo finishedPo)throws GlobalException;

    /**
     * 根据主键删除成品质检计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteFinishedByPks(FinishedPo finishedPo)throws GlobalException;
}
