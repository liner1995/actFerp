package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProcurementPo;
import cn.hups.productMageMent.service.IProcurementService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 生产流程Controller
 */
@RestController
@RequestMapping("/procurement")
public class ProcurementController {
    @Resource
    IProcurementService iProcurementService;

    /**
     * 分页查询所有采购信息
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllProcurementAsPage")
    public AjaxJson selectAllProcurementAsPage(@RequestBody ProcurementPo procurementPo) throws GlobalException{
        return iProcurementService.selectAllProcurementAsPage(procurementPo);
    }
    /**
     * 添加采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertProcurement")
    public AjaxJson insertProcurement(@RequestBody ProcurementPo procurementPo)throws GlobalException{
        return iProcurementService.insertProcurement(procurementPo);

    }

    /**
     * 修改采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateProcurement")
    public AjaxJson updateProcurement(@RequestBody ProcurementPo procurementPo)throws GlobalException{
        return iProcurementService.updateProcurement(procurementPo);
    }

    /**
     * 根据主键删除采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteProcurementByPks")
    public AjaxJson deleteProcurementByPks(@RequestBody ProcurementPo procurementPo)throws GlobalException{
        return iProcurementService.deleteProcurementByPks(procurementPo);
    }
}
