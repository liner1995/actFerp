package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.MaterialQcPo;
import cn.hups.productMageMent.po.ProcurementPo;

/**
 * 采购质检服务类
 */
public interface IMaterialQcService {


    /**
     * 分页查询所有采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllMaterialQcAsPage(MaterialQcPo materialQcPo) throws GlobalException;
    /**
     * 添加采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertMaterialQc(MaterialQcPo materialQcPo)throws GlobalException;

    /**
     * 修改采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateMaterialQc(MaterialQcPo materialQcPo)throws GlobalException;

    /**
     * 根据主键删除采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteMaterialQcByPks(MaterialQcPo materialQcPo)throws GlobalException;
}
