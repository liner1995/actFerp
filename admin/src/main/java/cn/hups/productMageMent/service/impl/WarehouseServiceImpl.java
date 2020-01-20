package cn.hups.productMageMent.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.AuthUtil;
import cn.hups.common.utils.DateUtils;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.dao.WfWarehouseMapper;
import cn.hups.productMageMent.dao.WfWarehouseMapperExpand;
import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.service.IWarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 库房备料流程
 */
@Service("iWarehouseService")
public class WarehouseServiceImpl implements IWarehouseService {

    AjaxJson ajaxJson = new AjaxJson();
    @Resource
    WfWarehouseMapper wfWarehouseMapper;
    @Resource
    WfWarehouseMapperExpand wfWarehouseMapperExpand;




    /**
     * 分页查询所有库房信息
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllWarehousePoAsPage(WarehousePo warehousePo) throws GlobalException{
        try {
            if(warehousePo != null){
                Long countNum = wfWarehouseMapperExpand.countData(warehousePo);
                List<WarehousePo> resultList = wfWarehouseMapperExpand.selectAllWarehousePoAsPage(warehousePo);
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
     * 添加库房备料
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertWarehouse(WarehousePo warehousePo) throws GlobalException{
        try {
            if (warehousePo != null) {
                Auth auth = AuthUtil.getAuth();
                warehousePo.setCreator(auth.getUserid());
                //warehousePo.setCreator(1);
                wfWarehouseMapper.insertSelective(warehousePo);
                ajaxJson.setPrimary(warehousePo.getPkProduction());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }


    /**
     * 修改库房房备料
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateWarehouse(WarehousePo warehousePo)throws GlobalException{
        try {
            if (warehousePo != null && warehousePo.getPkWarehouse() != null) {
                Auth auth = AuthUtil.getAuth();
                //warehousePo.setModifier(auth.getUserid());
                warehousePo.setModifiedtime(DateUtils.getKnowTsStr());
                Integer rw = wfWarehouseMapper.updateByPrimaryKeySelective(warehousePo);
                ajaxJson.setPrimary(rw);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;

    }

    /**
     * 根据主键删除库房房备料
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteWarehouseByPks(WarehousePo warehousePo)throws GlobalException{
        try {
            if (warehousePo != null && StringUtils.isNotEmpty(warehousePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(warehousePo.getPkArr());
                wfWarehouseMapperExpand.deleteWarehouseByPs(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合修改库房房备料状态
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    @Override
    public AjaxJson updateWarehouseStateByPks(WarehousePo warehousePo)throws GlobalException{
        try {
            if (warehousePo != null && StringUtils.isNotEmpty(warehousePo.getPkArr()) && warehousePo.getWhState()!=null) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(warehousePo.getPkArr());
                Auth auth = AuthUtil.getAuth();
                //warehousePo.setModifier(auth.getUserid());
                warehousePo.setModifiedtime(DateUtils.getKnowTsStr());
                warehousePo.setTs(DateUtils.getKnowTsStr());
                if(warehousePo.getWhState()==1){
                    warehousePo.setMprAffirmtime(DateUtils.getKnowTsStr());
                }
                if(warehousePo.getWhState()==2){
                    warehousePo.setArrivaltime(DateUtils.getKnowTsStr());
                }
                wfWarehouseMapperExpand.updateWarehouseStartByPs(warehousePo,pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
