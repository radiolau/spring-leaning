package o2o.order.service.user.dao.mapper;

import o2o.order.service.user.dao.po.OrderPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    OrderPO selectOrderById(Long orderId);
}
