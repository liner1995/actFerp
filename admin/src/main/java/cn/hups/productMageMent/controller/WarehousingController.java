package cn.hups.productMageMent.controller;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.common.utils.StringUtils;
import cn.hups.productMageMent.po.WarehousingPo;
import cn.hups.productMageMent.service.IWarehousingService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * 物料入库Controller
 */
@RestController
@RequestMapping("/warehousing")
public class WarehousingController {
    @Resource
    IWarehousingService iWarehousingService;

    /**
     * 分页查询所有入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllWarehousingAsPage")
    public AjaxJson selectAllWarehousingAsPage(@RequestBody WarehousingPo warehousingPo) throws GlobalException{
        return iWarehousingService.selectAllWarehousingAsPage(warehousingPo);
    }
    /**
     * 添加入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertWarehousing")
    public AjaxJson insertWarehousing(@RequestBody WarehousingPo warehousingPo) throws GlobalException{
        return  iWarehousingService.insertWarehousing(warehousingPo);
    }

    /**
     * 修改入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateWarehousing")
    public AjaxJson updateWarehousing(@RequestBody WarehousingPo warehousingPo)throws GlobalException{
        return  iWarehousingService.updateWarehousing(warehousingPo);
    }

    /**
     * 根据主键删除入库信息
     * @param warehousingPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteWarehousingByPks")
    public AjaxJson deleteWarehousingByPks(@RequestBody WarehousingPo warehousingPo)throws GlobalException{
        return iWarehousingService.deleteWarehousingByPks(warehousingPo);
    }
}
