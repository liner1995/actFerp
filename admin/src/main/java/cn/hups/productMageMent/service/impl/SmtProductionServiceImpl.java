package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfSmtProductionMapper;
import cn.hups.productMageMent.dao.WfSmtProductionMapperExpand;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.po.SmtProductionPo;
import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.service.ISmtProductionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * SMT生产管理类
 */
@Service("iSmtProductionService")
public class SmtProductionServiceImpl implements ISmtProductionService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfSmtProductionMapper wfSmtProductionMapper;
    @Resource
    WfSmtProductionMapperExpand wfSmtProductionMapperExpand;
    /**
     * 分页查询所有SMT生产信息
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllSmtProductionAsPage(SmtProductionPo smtProductionPo) throws GlobalException{
        try {
            if(smtProductionPo != null){
                Long countNum = wfSmtProductionMapperExpand.countData(smtProductionPo);
                List<SmtProductionPo> resultList = wfSmtProductionMapperExpand.selectAllSmtProductionAsPage(smtProductionPo);
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
     * 添加SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertSmtProduction(SmtProductionPo smtProductionPo)throws GlobalException{
        try {
            if (smtProductionPo != null) {
                Auth auth = AuthUtil.getAuth();
                //smtProductionPo.setCreator(auth.getUserid());
                smtProductionPo.setCreator(1);
                wfSmtProductionMapper.insertSelective(smtProductionPo);
                ajaxJson.setPrimary(smtProductionPo.getPkSmtProduction());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }

    /**
     * 修改SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateSmtProduction(SmtProductionPo smtProductionPo)throws GlobalException{

        try {
            if (smtProductionPo != null && smtProductionPo.getPkSmtProduction() != null) {
                Auth auth = AuthUtil.getAuth();
                //smtProductionPo.setModifier(auth.getUserid());
                smtProductionPo.setModifier(11);
                smtProductionPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfSmtProductionMapper.updateByPrimaryKeySelective(smtProductionPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键删除SMT生产计划
     * @param smtProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteSmtProductionByPks(SmtProductionPo smtProductionPo)throws GlobalException{
        try {
            if (smtProductionPo != null && StringUtils.isNotEmpty(smtProductionPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smtProductionPo.getPkArr());
                wfSmtProductionMapperExpand.deleteSmtProductionByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
