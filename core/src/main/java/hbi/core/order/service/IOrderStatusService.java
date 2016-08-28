package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.order.dto.OrderStatus;

public interface IOrderStatusService extends IBaseService<OrderStatus>, ProxySelf<IOrderStatusService>{
	List<OrderStatus> selectOrderStatus(IRequest requestContext, OrderStatus orderStatus,int page, int pagesize);

}
