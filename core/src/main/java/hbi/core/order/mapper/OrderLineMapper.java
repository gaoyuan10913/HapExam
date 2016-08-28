package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.OrderLine;

public interface OrderLineMapper extends Mapper<OrderLine>{

	List<OrderLine> selectOrderLine(OrderLine orderline);
	
}
