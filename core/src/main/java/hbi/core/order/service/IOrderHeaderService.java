package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.order.dto.OrderHeader;

public interface IOrderHeaderService extends IBaseService<OrderHeader>, ProxySelf<IOrderHeaderService>{

    List<OrderHeader> selectByOrderHeader(IRequest requestContext, OrderHeader orderHeader, int page, int pagesize);

    List<OrderHeader> batchUpdate(IRequest requestContext, @StdWho List<OrderHeader> orderHeaders);
}
