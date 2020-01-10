package cn.hups.productMageMent.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;

import cn.hups.productMageMent.po.FinishedPo;
import cn.hups.productMageMent.service.IFinishedService;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 成品质检生产Controller
 */
@RestController
@RequestMapping("/finished")
public class FinishedController {

    @Resource
    IFinishedService iFinishedService;
    /**
     * 分页查询所有成品信息
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllFinishedAsPage")
    public AjaxJson selectAllFinishedAsPage(@RequestBody FinishedPo finishedPo) throws GlobalException{
        return  iFinishedService.selectAllFinishedAsPage(finishedPo);
    }
    /**
     * 添加成品计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertFinished")
    public AjaxJson insertFinished(@RequestBody FinishedPo finishedPo)throws GlobalException{
        return iFinishedService.insertFinished(finishedPo);

    }

    /**
     * 修改成品计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateFinished")
    public AjaxJson updateFinished(@RequestBody FinishedPo finishedPo)throws GlobalException{
        return iFinishedService.updateFinished(finishedPo);

    }

    /**
     * 根据主键删除成品计划
     * @param finishedPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteFinishedByPks")
    public AjaxJson deleteFinishedByPks(@RequestBody FinishedPo finishedPo)throws GlobalException{
        return iFinishedService.deleteFinishedByPks(finishedPo);

    }
}
