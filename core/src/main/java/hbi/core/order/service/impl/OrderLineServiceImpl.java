package hbi.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.order.dto.OrderLine;
import hbi.core.order.mapper.OrderLineMapper;
import hbi.core.order.service.IOrderLineService;
	@Service
	public class OrderLineServiceImpl extends BaseServiceImpl<OrderLine> implements IOrderLineService {
	    
	    @Autowired
	    private OrderLineMapper orderlineMapper;
		
		
		@Override
		public List<OrderLine> selectOrderLine(IRequest requestContext, OrderLine orderline, int page, int pagesize) {
			// TODO Auto-generated method stub
			PageHelper.startPage(page, pagesize);
			return orderlineMapper.selectOrderLine(orderline);
		}

	}
