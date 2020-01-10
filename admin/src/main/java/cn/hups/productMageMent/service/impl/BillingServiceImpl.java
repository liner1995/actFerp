package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfBillingMapper;
import cn.hups.productMageMent.dao.WfBillingMapperExpand;
import cn.hups.productMageMent.po.BillingPo;
import cn.hups.productMageMent.service.IBillingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 开票管理类
 */
@Service("iBillingService")
public class BillingServiceImpl implements IBillingService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfBillingMapper wfBillingMapper;
    @Resource
    WfBillingMapperExpand wfBillingMapperExpand;
    /**
     * 分页查询所有开票信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllBillingAsPage(BillingPo billingPo) throws GlobalException{
        try {
            if(billingPo != null){
                Long countNum = wfBillingMapperExpand.countData(billingPo);
                List<BillingPo> resultList = wfBillingMapperExpand.selectAllBillingAsPage(billingPo);
                ajaxJson.setTotal(countNum);
                ajaxJson.setObj(resultList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }
    /**
     * 添加开票计划
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertBilling(BillingPo billingPo)throws GlobalException{
        try {
            if (billingPo != null) {
                Auth auth = AuthUtil.getAuth();
                //billingPo.setCreator(auth.getUserid());
                billingPo.setCreator(1);
                wfBillingMapper.insertSelective(billingPo);
                ajaxJson.setPrimary(billingPo.getPkBilling());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }

    /**
     * 修改开票计划
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateBilling(BillingPo billingPo)throws GlobalException{

        try {
            if (billingPo != null && billingPo.getPkBilling() != null) {
                Auth auth = AuthUtil.getAuth();
                //billingPo.setModifier(auth.getUserid());
                billingPo.setModifier(11);
                billingPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfBillingMapper.updateByPrimaryKeySelective(billingPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键删除开票通知信息
     * @param billingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteBillingByPks(BillingPo billingPo)throws GlobalException{
        try {
            if (billingPo != null && StringUtils.isNotEmpty(billingPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(billingPo.getPkArr());
                wfBillingMapperExpand.deleteBillingByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
