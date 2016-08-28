package hbi.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.order.dto.OrderStatus;
import hbi.core.order.mapper.OrderStatusMapper;
import hbi.core.order.service.IOrderStatusService;

@Service
public class OrderStatusServiceImpl extends BaseServiceImpl<OrderStatus> implements IOrderStatusService {

	@Autowired
	private OrderStatusMapper orderStatusMapper;
	
	@Override
	public List<OrderStatus> selectOrderStatus(IRequest requestContext, OrderStatus orderStatus, int page, int pagesize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, pagesize);
		return orderStatusMapper.selectOrderStatus(orderStatus);
	}

}
