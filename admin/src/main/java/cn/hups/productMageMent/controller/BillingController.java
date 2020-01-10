package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.BillingPo;
import cn.hups.productMageMent.service.IBillingService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 通知开票Controller
 */
@RestController
@RequestMapping("/billing")
public class BillingController {

    @Resource
    IBillingService iBillingService;
    /**
     * 分页查询所有通知开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBillingAsPage")
    public AjaxJson selectAllBillingAsPage(@RequestBody BillingPo billingPo) throws GlobalException{
        return  iBillingService.selectAllBillingAsPage(billingPo);
    }
    /**
     * 添加通知开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertBilling")
    public AjaxJson insertBilling(@RequestBody BillingPo billingPo)throws GlobalException{
        return iBillingService.insertBilling(billingPo);

    }

    /**
     * 修改通知开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateBilling")
    public AjaxJson updateBilling(@RequestBody BillingPo billingPo)throws GlobalException{
        return iBillingService.updateBilling(billingPo);

    }

    /**
     * 根据主键删除通知开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteBillingByPks")
    public AjaxJson deleteBillingByPks(@RequestBody BillingPo billingPo)throws GlobalException{
        return iBillingService.deleteBillingByPks(billingPo);

    }
}
