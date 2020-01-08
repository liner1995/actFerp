package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.service.IProductionService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 生产流程Controller
 */
@RestController
@RequestMapping("/production")
public class ProductionController {
    @Resource
    IProductionService iProductionService;

    /**
     * 分页查询所有产品信息
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllProductionAsPage")
    public AjaxJson selectAllProductionAsPage(@RequestBody ProductionPo productionPo) throws GlobalException{
        return iProductionService.selectAllProductionAsPage(productionPo);
    }

    /**
     * 添加生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertProduction")
    public AjaxJson insertProduction(@RequestBody ProductionPo productionPo) throws GlobalException {
        return iProductionService.insertProduction(productionPo);
    }

    /**
     * 根据主键删除生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteProductionByPks")
    public AjaxJson deleteProductionByPks(@RequestBody ProductionPo productionPo)throws GlobalException{
        return iProductionService.deleteProductionByPks(productionPo);
    }

    /**
     * 修改生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateProduction")
    public AjaxJson updateProduction(@RequestBody ProductionPo productionPo) throws GlobalException {
        return iProductionService.updateProduction(productionPo);
    }
}

