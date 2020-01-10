package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfWarehousingMapper;
import cn.hups.productMageMent.dao.WfWarehousingMapperExpand;
import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.po.WarehousingPo;
import cn.hups.productMageMent.service.IWarehousingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 材料入库管理类
 */
@Service("iWarehousingService")
public class WarehousingImpl implements IWarehousingService {

    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfWarehousingMapper wfWarehousingMapper;
    @Resource
    WfWarehousingMapperExpand wfWarehousingMapperExpand;
    /**
     * 分页查询所有入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson selectAllWarehousingAsPage(WarehousingPo warehousingPo) throws GlobalException{
        try {
            if(warehousingPo != null){
                Long countNum = wfWarehousingMapperExpand.countData(warehousingPo);
                List<WarehousingPo> resultList = wfWarehousingMapperExpand.selectAllWarehousingPoAsPage(warehousingPo);
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
     * 添加入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson insertWarehousing(WarehousingPo warehousingPo) throws GlobalException{
        try {
            if (warehousingPo != null) {
                Auth auth = AuthUtil.getAuth();
                //warehousingPo.setCreator(auth.getUserid());
                warehousingPo.setCreator(1);
                wfWarehousingMapper.insertSelective(warehousingPo);
                ajaxJson.setPrimary(warehousingPo.getPkWarehousing());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 修改入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateWarehousing(WarehousingPo warehousingPo)throws GlobalException{
        try {
            if (warehousingPo != null && warehousingPo.getPkWarehousing() != null) {
                Auth auth = AuthUtil.getAuth();
                //warehousingPo.setModifier(auth.getUserid());
                warehousingPo.setModifier(88);
                warehousingPo.setModifiertime(DateUtils.getKnowTsStr());
                Integer rw = wfWarehousingMapper.updateByPrimaryKeySelective(warehousingPo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }

    /**
     * 根据主键删除入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson deleteWarehousingByPks(WarehousingPo warehousingPo)throws GlobalException{
        try {
            if (warehousingPo != null && StringUtils.isNotEmpty(warehousingPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(warehousingPo.getPkArr());
                wfWarehousingMapperExpand.deleteWarehousingByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

}
