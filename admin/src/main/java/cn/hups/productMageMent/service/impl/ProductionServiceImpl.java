package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.orgs.po.BdDeptdocPo;
import cn.hups.productMageMent.dao.WfProductionMapper;
import cn.hups.productMageMent.dao.WfProductionMapperExpand;
import cn.hups.productMageMent.po.ProductionPo;
import cn.hups.productMageMent.service.IProductionService;
import cn.hups.salemage.po.BdProductPo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service("IProductionService")
public class ProductionServiceImpl implements IProductionService {

    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfProductionMapper wfProductionMapper;
    @Resource
    WfProductionMapperExpand wfProductionMapperExpand;


    /**
     * 分页查询所有产品信息
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllProductionAsPage(ProductionPo productionPo) throws GlobalException{
        try {
            if(productionPo != null){
                Long countNum = wfProductionMapperExpand.countData(productionPo);
                List<ProductionPo> resultList = wfProductionMapperExpand.selectAllProductionAsPage(productionPo);
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
     * 添加生产计划
     *
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertProduction(ProductionPo productionPo) throws GlobalException {
        try {
            if (productionPo != null) {
                Auth auth = AuthUtil.getAuth();
                productionPo.setCreator(auth.getUserid());
               // productionPo.setCreator(1);
                wfProductionMapper.insertSelective(productionPo);
                ajaxJson.setPrimary(productionPo.getPkProduction());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键删除生产计划
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteProductionByPks(ProductionPo productionPo)throws GlobalException{
        try {
            if (productionPo != null && StringUtils.isNotEmpty(productionPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(productionPo.getPkArr());
                wfProductionMapperExpand.deleteProductionByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
    /**
     * 修改生产计划
     *
     * @param productionPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateProduction(ProductionPo productionPo) throws GlobalException {
        try {
            if (productionPo != null && productionPo.getPkProduction() != null) {
                Auth auth = AuthUtil.getAuth();
                productionPo.setModifier(auth.getUserid());
                productionPo.setModifiertime(DateUtils.getKnowTsStr());
               Integer rw = wfProductionMapper.updateByPrimaryKeySelective(productionPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }



}