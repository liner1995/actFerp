package cn.hups.productMageMent.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.po.WarehousingPo;

/**
 * 材料入库服务类
 */
public interface IWarehousingService {
    /**
     * 分页查询所有入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllWarehousingAsPage(WarehousingPo warehousingPo) throws GlobalException;
    /**
     * 添加入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertWarehousing(WarehousingPo warehousingPo) throws GlobalException;

    /**
     * 修改入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateWarehousing(WarehousingPo warehousingPo)throws GlobalException;

    /**
     * 根据主键删除入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteWarehousingByPks(WarehousingPo warehousingPo)throws GlobalException;
}
