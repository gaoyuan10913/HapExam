package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.OrderStatus;

public interface OrderStatusMapper extends Mapper<OrderStatus>{

	List<OrderStatus> selectOrderStatus(OrderStatus orderStatus);
	
}
