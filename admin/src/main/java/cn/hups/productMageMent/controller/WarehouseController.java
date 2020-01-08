package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.productMageMent.po.WarehousePo;
import cn.hups.productMageMent.service.IWarehouseService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 库房流程Controller
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    @Resource
    IWarehouseService iWarehouseService;


    /**
     * 分页查询所有库房信息
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllWarehousePoAsPage")
    public AjaxJson selectAllWarehousePoAsPage(@RequestBody WarehousePo warehousePo) throws GlobalException{
        return iWarehouseService.selectAllWarehousePoAsPage(warehousePo);
    }
    /**
     * 添加库房备料
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertWarehouse")
    public AjaxJson insertWarehouse(@RequestBody WarehousePo warehousePo) throws GlobalException{
        return iWarehouseService.insertWarehouse(warehousePo);
    }

    /**
     * 修改生产计划
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateWarehouse")
    public AjaxJson updateWarehouse(@RequestBody WarehousePo warehousePo)throws GlobalException{
        return iWarehouseService.updateWarehouse(warehousePo);
    }

    /**
     * 根据主键删除生产计划
     * @param warehousePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteWarehouseByPks")
    public AjaxJson deleteWarehouseByPks(@RequestBody WarehousePo warehousePo)throws GlobalException{
        return iWarehouseService.deleteWarehouseByPks(warehousePo);
    }
}
