package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfFinishedMapper;
import cn.hups.productMageMent.dao.WfFinishedMapperExpand;
import cn.hups.productMageMent.po.FinishedPo;
import cn.hups.productMageMent.service.IFinishedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.List;
@Service("iFinishedService")
public class FinishedServiceImpl implements IFinishedService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfFinishedMapper wfFinishedMapper;
    @Resource
    WfFinishedMapperExpand wfFinishedMapperExpand;


    /**
     * 分页查询所有成品信息
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllFinishedAsPage(FinishedPo finishedPo) throws GlobalException{
        try {
            if(finishedPo != null){
                Long countNum = wfFinishedMapperExpand.countData(finishedPo);
                List<FinishedPo> resultList = wfFinishedMapperExpand.selectAllFinishedAsPage(finishedPo);
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
     * 添加成品信息
     *
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertFinished(FinishedPo finishedPo) throws GlobalException {
        try {
            if (finishedPo != null) {
                Auth auth = AuthUtil.getAuth();
                //finishedPo.setCreator(auth.getUserid());
                finishedPo.setCreator(1);
                BigDecimal passNumber = new BigDecimal(finishedPo.getPassNumber().toString());
                BigDecimal Number = new BigDecimal(finishedPo.getQcNumber().toString());
                BigDecimal passRate = passNumber.divide(Number,4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                finishedPo.setPassRate(passRate);
                finishedPo.setAccumulation(finishedPo.getOutputNumber());

                wfFinishedMapper.insertSelective(finishedPo);
                ajaxJson.setPrimary(finishedPo.getPkFinished());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键删除成品信息
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteFinishedByPks(FinishedPo finishedPo)throws GlobalException{
        try {
            if (finishedPo != null && StringUtils.isNotEmpty(finishedPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(finishedPo.getPkArr());
                wfFinishedMapperExpand.deleteFinishedByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
    /**
     * 修改成品信息
     *
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateFinished(FinishedPo finishedPo) throws GlobalException {
        try {
            if (finishedPo != null && finishedPo.getPkFinished() != null) {
                Auth auth = AuthUtil.getAuth();
                // finishedPo.setModifier(auth.getUserid());
                finishedPo.setModifier(1);
                BigDecimal passNumber = new BigDecimal(finishedPo.getPassNumber().toString());
                BigDecimal Number = new BigDecimal(finishedPo.getQcNumber().toString());
                BigDecimal passRate = passNumber.divide(Number, 4, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                finishedPo.setPassRate(passRate);
                finishedPo.setModifiertime(DateUtils.getKnowTsStr());
            }
            if(finishedPo.getOutputNumber()!=null) {
                int accumulation = wfFinishedMapper.selectByPrimaryKey(finishedPo.getPkFinished()).getAccumulation();
                finishedPo.setAccumulation(accumulation + finishedPo.getOutputNumber());
            }

                Integer rw = wfFinishedMapper.updateByPrimaryKeySelective(finishedPo);
                ajaxJson.setPrimary(rw);

        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }


}
