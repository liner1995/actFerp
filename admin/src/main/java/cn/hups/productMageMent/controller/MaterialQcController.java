package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.MaterialQcPo;
import cn.hups.productMageMent.service.IMaterialQcService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 物料质检Controller
 */
@RestController
@RequestMapping("/materialQc")
public class MaterialQcController {
    @Resource
    IMaterialQcService iMaterialQcService;

    /**
     * 分页查询所有采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllMaterialQcAsPage")
    public AjaxJson selectAllMaterialQcAsPage(@RequestBody MaterialQcPo materialQcPo) throws GlobalException{
        return iMaterialQcService.selectAllMaterialQcAsPage(materialQcPo);
    }
    /**
     * 添加采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertMaterialQc")
    public AjaxJson insertMaterialQc(@RequestBody MaterialQcPo materialQcPo)throws GlobalException{
        return iMaterialQcService.insertMaterialQc(materialQcPo);
    }

    /**
     * 修改采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateMaterialQc")
    public AjaxJson updateMaterialQc(@RequestBody MaterialQcPo materialQcPo)throws GlobalException{
        return iMaterialQcService.updateMaterialQc(materialQcPo);
    }

    /**
     * 根据主键删除采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteMaterialQcByPks")
   public AjaxJson deleteMaterialQcByPks(@RequestBody MaterialQcPo materialQcPo)throws GlobalException{
        return iMaterialQcService.deleteMaterialQcByPks(materialQcPo);
    }
}
