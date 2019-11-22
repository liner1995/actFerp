package cn.hups.orderCustomer.dao;

import cn.hups.orderCustomer.entity.BillProductOrderH;
import cn.hups.orderCustomer.entity.BillProductOrderHExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillProductOrderHMapper {
    int countByExample(BillProductOrderHExample example);

    int deleteByExample(BillProductOrderHExample example);

    int deleteByPrimaryKey(Integer pkProductOrder);

    int insert(BillProductOrderH record);

    int insertSelective(BillProductOrderH record);

    List<BillProductOrderH> selectByExample(BillProductOrderHExample example);

    BillProductOrderH selectByPrimaryKey(Integer pkProductOrder);

    int updateByExampleSelective(@Param("record") BillProductOrderH record, @Param("example") BillProductOrderHExample example);

    int updateByExample(@Param("record") BillProductOrderH record, @Param("example") BillProductOrderHExample example);

    int updateByPrimaryKeySelective(BillProductOrderH record);

    int updateByPrimaryKey(BillProductOrderH record);
}