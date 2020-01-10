package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfProcurementMapper;
import cn.hups.productMageMent.dao.WfProcurmentMapperExpand;
import cn.hups.productMageMent.dao.WfProductionMapper;
import cn.hups.productMageMent.po.ProcurementPo;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.service.IProcurementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
@Service("iProcurementService")
public class ProcurementServiceImpl implements IProcurementService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfProcurementMapper wfProcurementMapper;
    @Resource
    WfProcurmentMapperExpand wfProcurmentMapperExpand;

    /**
     * 分页查询所有采购信息
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllProcurementAsPage(ProcurementPo procurementPo) throws GlobalException{
        try {
            if(procurementPo != null){
                Long countNum = wfProcurmentMapperExpand.countData(procurementPo);
                List<ProcurementPo> resultList = wfProcurmentMapperExpand.selectAllProcurmentAsPage(procurementPo);
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
     * 添加采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertProcurement(ProcurementPo procurementPo)throws GlobalException{
        try {
            if (procurementPo != null) {
                Auth auth = AuthUtil.getAuth();
                procurementPo.setCreator(auth.getUserid());
                //procurementPo.setCreator(1);
                wfProcurementMapper.insertSelective(procurementPo);
                ajaxJson.setPrimary(procurementPo.getPkProcurement());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;
    }

    /**
     * 修改采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateProcurement(ProcurementPo procurementPo)throws GlobalException{
        try {
            if (procurementPo != null && procurementPo.getPkProcurement() != null) {
                Auth auth = AuthUtil.getAuth();
                procurementPo.setModifier(auth.getUserid());
                //procurementPo.setModifier(1);
                procurementPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfProcurementMapper.updateByPrimaryKeySelective(procurementPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;

    }

    /**
     * 根据主键删除采购计划
     * @param procurementPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteProcurementByPks(ProcurementPo procurementPo)throws GlobalException{
        try {
            if (procurementPo != null && StringUtils.isNotEmpty(procurementPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(procurementPo.getPkArr());
                wfProcurmentMapperExpand.deleteProcurmentByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;

    }
}
