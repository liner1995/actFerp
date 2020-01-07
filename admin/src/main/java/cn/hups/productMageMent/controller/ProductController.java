package cn.hups.productMageMent.controller;

import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.service.IProductService;
import cn.hups.salemage.po.BdProductPo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 生产流程Controller
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    IProductService iProductService;

    /**
     * 根据订单主键查询订单相关信息参照
     * @param bdProductPo
     * @return
     */
    @RequestMapping("/selectProductCustomerByPkProductAsRef")
    public AjaxJson selectProductCustomerByPkProductAsRef(@RequestBody BdProductPo bdProductPo){
        return iProductService.selectProductCustomerByPkProductAsRef(bdProductPo);
    }

    /**
     * 分页查询订单数据作为参照
     * @param bdProductPo
     * @return
     */
    @RequestMapping("/selectProductCustomerAsPage")
    public AjaxJson selectProductCustomerAsPage(@RequestBody BdProductPo bdProductPo){
        return iProductService.selectProductCustomerAsPage(bdProductPo);
    }

}
