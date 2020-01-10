package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.DipProductionPo;
import cn.hups.productMageMent.service.IDipProductionService;
import cn.hups.productMageMent.service.IDipProductionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DIP生产Controller
 */
@RestController
@RequestMapping("/dipProduction")
public class DipProductionController {

    @Resource
    IDipProductionService iDipProductionService;
    /**
     * 分页查询所有Dip生产信息
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllDipProductionAsPage")
    public AjaxJson selectAllDipProductionAsPage(@RequestBody DipProductionPo dipProductionPo) throws GlobalException{
        return  iDipProductionService.selectAllDipProductionAsPage(dipProductionPo);
    }
    /**
     * 添加Dip生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertDipProduction")
    public AjaxJson insertDipProduction(@RequestBody DipProductionPo dipProductionPo)throws GlobalException{
        return iDipProductionService.insertDipProduction(dipProductionPo);

    }

    /**
     * 修改Dip生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateDipProduction")
    public AjaxJson updateDipProduction(@RequestBody DipProductionPo dipProductionPo)throws GlobalException{
        return iDipProductionService.updateDipProduction(dipProductionPo);

    }

    /**
     * 根据主键删除Dip生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteDipProductionByPks")
    public AjaxJson deleteDipProductionByPks(@RequestBody DipProductionPo dipProductionPo)throws GlobalException{
        return iDipProductionService.deleteDipProductionByPks(dipProductionPo);

    }
}
