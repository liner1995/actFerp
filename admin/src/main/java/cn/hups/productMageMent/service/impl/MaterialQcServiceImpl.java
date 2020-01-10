package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfMaterialQcMapper;
import cn.hups.productMageMent.dao.WfMaterialQcMapperExpand;
import cn.hups.productMageMent.po.MaterialQcPo;
import cn.hups.productMageMent.po.ProcurementPo;
import cn.hups.productMageMent.service.IMaterialQcService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 采购质检管理类
 */
@Service("iMaterialQcService")
public class MaterialQcServiceImpl implements IMaterialQcService {
    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfMaterialQcMapper wfMaterialQcMapper;
    @Resource
    WfMaterialQcMapperExpand wfMaterialQcMapperExpand;

    /**
     * 分页查询所有采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllMaterialQcAsPage(MaterialQcPo materialQcPo) throws GlobalException{
        try {
            if(materialQcPo != null){
                Long countNum = wfMaterialQcMapperExpand.countData(materialQcPo);
                List<MaterialQcPo> resultList = wfMaterialQcMapperExpand.selectAllMaterialQcAsPage(materialQcPo);
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
     * 添加采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertMaterialQc(MaterialQcPo materialQcPo)throws GlobalException{
        try {
            if (materialQcPo != null) {
                Auth auth = AuthUtil.getAuth();
                //materialQcPo.setCreator(auth.getUserid());
                materialQcPo.setCreator(1);
                wfMaterialQcMapper.insertSelective(materialQcPo);
                ajaxJson.setPrimary(materialQcPo.getPkMaterialQc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;

    }

    /**
     * 修改采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateMaterialQc(MaterialQcPo materialQcPo)throws GlobalException{
        try {
            if (materialQcPo != null && materialQcPo.getPkMaterialQc() != null) {
                Auth auth = AuthUtil.getAuth();
                //materialQcPo.setModifier(auth.getUserid());
                materialQcPo.setModifier(1);
                materialQcPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfMaterialQcMapper.updateByPrimaryKeySelective(materialQcPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;

    }

    /**
     * 根据主键删除采购质检信息
     * @param materialQcPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteMaterialQcByPks(MaterialQcPo materialQcPo)throws GlobalException{
        try {
            if (materialQcPo != null && StringUtils.isNotEmpty(materialQcPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(materialQcPo.getPkArr());
                wfMaterialQcMapperExpand.deleteMaterialQcByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;
    }
}
