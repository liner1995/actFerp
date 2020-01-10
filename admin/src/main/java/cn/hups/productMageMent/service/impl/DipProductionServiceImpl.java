package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfDipProductionMapper;
import cn.hups.productMageMent.dao.WfDipProductionMapperExpand;
import cn.hups.productMageMent.dao.WfDipProductionMapper;
import cn.hups.productMageMent.dao.WfDipProductionMapperExpand;
import cn.hups.productMageMent.po.DipProductionPo;
import cn.hups.productMageMent.po.DipProductionPo;
import cn.hups.productMageMent.service.IDipProductionService;
import cn.hups.productMageMent.service.IDipProductionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * DIP生产管理类
 */
@Service("iDipProductionService")
public class DipProductionServiceImpl implements IDipProductionService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfDipProductionMapper wfDipProductionMapper;
    @Resource
    WfDipProductionMapperExpand wfDipProductionMapperExpand;
    /**
     * 分页查询所有Dip生产信息
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllDipProductionAsPage(DipProductionPo dipProductionPo) throws GlobalException{
        try {
            if(dipProductionPo != null){
                Long countNum = wfDipProductionMapperExpand.countData(dipProductionPo);
                List<DipProductionPo> resultList = wfDipProductionMapperExpand.selectAllDipProductionAsPage(dipProductionPo);
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
     * 添加DIP生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertDipProduction(DipProductionPo dipProductionPo)throws GlobalException{
        try {
            if (dipProductionPo != null) {
                Auth auth = AuthUtil.getAuth();
                //dipProductionPo.setCreator(auth.getUserid());
                dipProductionPo.setCreator(1);
                wfDipProductionMapper.insertSelective(dipProductionPo);
                ajaxJson.setPrimary(dipProductionPo.getPkDipProduction());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }

    /**
     * 修改Dip生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateDipProduction(DipProductionPo dipProductionPo)throws GlobalException{

        try {
            if (dipProductionPo != null && dipProductionPo.getPkDipProduction() != null) {
                Auth auth = AuthUtil.getAuth();
                //dipProductionPo.setModifier(auth.getUserid());
                dipProductionPo.setModifier(11);
                dipProductionPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfDipProductionMapper.updateByPrimaryKeySelective(dipProductionPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键删除Dip生产计划
     * @param dipProductionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteDipProductionByPks(DipProductionPo dipProductionPo)throws GlobalException{
        try {
            if (dipProductionPo != null && StringUtils.isNotEmpty(dipProductionPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(dipProductionPo.getPkArr());
                wfDipProductionMapperExpand.deleteDipProductionByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
