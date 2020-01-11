package cn.hups.statisticsModule.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.customer.dao.BdCustomdocMapper;
import cn.hups.customer.entity.BdCustomdoc;
import cn.hups.statisticsModule.dao.OrderStatisticsMapperExpand;
import cn.hups.statisticsModule.po.OrderStatisticsPo;
import cn.hups.statisticsModule.service.IOrderStatistcsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * 订单统计模块管理类
 */
@Service("iOrderStatistcsService")
public class OrderStatistcsServiceImpl implements IOrderStatistcsService {

    @Resource
    private BdCustomdocMapper bdCustomdocMapper;
    @Resource
    private OrderStatisticsMapperExpand orderStatisticsMapperExpand;
    /**
     * 根据订单主键查询订参照信息
     * @param orderStatisticsPo
     * @return
     * @throws SQLException
     */
    @Override
    public AjaxJson selectAllOrderProductBAsRef(OrderStatisticsPo orderStatisticsPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        try {
            if (orderStatisticsPo != null && orderStatisticsPo.getPkProductOrder() != null) {
                OrderStatisticsPo resultList = orderStatisticsMapperExpand.selectAllOrderProductBAsRef(orderStatisticsPo);
                if(resultList.getPurchaseContacts()!=null){
                    BdCustomdoc purchaseContacts = bdCustomdocMapper.selectByPrimaryKey(resultList.getPurchaseContacts());
                    resultList.setPurchaseContactsName(purchaseContacts.getCustomname());
                    resultList.setPurchaseContactsTel(purchaseContacts.getTelnum());
                }
                if(resultList.getSkillContacts()!=null){
                    BdCustomdoc skillContacts = bdCustomdocMapper.selectByPrimaryKey(resultList.getSkillContacts());
                    resultList.setSkillContactsName(skillContacts.getCustomname());
                    resultList.setSkillContactsTel(skillContacts.getTelnum());
                }
                ajaxJson.setObj(resultList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }
        return ajaxJson;
    }
}
