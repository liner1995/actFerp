package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.po.SmtProductionPo;
import cn.hups.productMageMent.service.ISmtProductionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * SMT生产Controller
 */
@RestController
@RequestMapping("/smtProduction")
public class SmtProductionController {

    @Resource
    ISmtProductionService iSmtProductionService;
    /**
     * 分页查询所有SMT生产信息
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmtProductionAsPage")
    public AjaxJson selectAllSmtProductionAsPage(@RequestBody SmtProductionPo smtProductionPo) throws GlobalException{
        return  iSmtProductionService.selectAllSmtProductionAsPage(smtProductionPo);
    }
    /**
     * 添加SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSmtProduction")
    public AjaxJson insertSmtProduction(@RequestBody SmtProductionPo smtProductionPo)throws GlobalException{
        return iSmtProductionService.insertSmtProduction(smtProductionPo);

    }

    /**
     * 修改SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSmtProduction")
    public AjaxJson updateSmtProduction(@RequestBody SmtProductionPo smtProductionPo)throws GlobalException{
        return iSmtProductionService.updateSmtProduction(smtProductionPo);

    }

    /**
     * 根据主键删除SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSmtProductionByPks")
    public AjaxJson deleteSmtProductionByPks(@RequestBody SmtProductionPo smtProductionPo)throws GlobalException{
        return iSmtProductionService.deleteSmtProductionByPks(smtProductionPo);

    }
}
