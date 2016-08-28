package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.order.dto.OrderLine;

public interface IOrderLineService extends IBaseService<OrderLine>, ProxySelf<IOrderLineService>{
	List<OrderLine> selectOrderLine(IRequest requestContext, OrderLine orderline,int page, int pagesize);

}
