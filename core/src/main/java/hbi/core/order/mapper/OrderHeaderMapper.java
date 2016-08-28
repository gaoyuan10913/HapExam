package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.OrderHeader;

public interface OrderHeaderMapper extends Mapper<OrderHeader>{

	List<OrderHeader> selectByOrderHeader(OrderHeader header);
	
	int insertOrderHeader(OrderHeader header);
	
    int updateOrderHeader(OrderHeader header);
    
    int deleteOrderHeader(OrderHeader header);
}
