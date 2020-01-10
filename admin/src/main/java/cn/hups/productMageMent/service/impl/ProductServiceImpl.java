package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.ProductMageMentPo;
import cn.hups.productMageMent.service.IProductService;
import cn.hups.salemage.dao.BdProductMapperExpand;
import cn.hups.salemage.po.BdProductPo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("iProductService")
public class ProductServiceImpl implements IProductService {

    AjaxJson ajaxJson = new AjaxJson();

    @Resource
    BdProductMapperExpand bdProductMapperExpand;

    /**
     * 根据订单主键信息查询产品作为参照
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectProductCustomerByPkProductAsRef(BdProductPo bdProductPo) throws GlobalException {
        try {
            if(bdProductPo!=null){
                ProductMageMentPo productMageMentPo = bdProductMapperExpand.selectProductCustomerByPkProductAsRef(bdProductPo.getPkProduct());
                ajaxJson.setObj(productMageMentPo);
            }
            return ajaxJson;
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
    }

    /**
     * 分页查询订单信息
     * @param bdProductPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectProductCustomerAsPage(BdProductPo bdProductPo) throws GlobalException {

        try {
            if(bdProductPo!=null) {
                Long countNum = bdProductMapperExpand.countData(bdProductPo);
                List<ProductMageMentPo> resultList = bdProductMapperExpand.selectProductCustomerAsPage(bdProductPo);
                ajaxJson.setTotal(countNum);
                ajaxJson.setObj(resultList);
            }
            return ajaxJson;
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        }
    }



