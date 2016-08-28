package hbi.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.order.dto.OrderHeader;
import hbi.core.order.mapper.OrderHeaderMapper;
import hbi.core.order.service.IOrderHeaderService;

@Service
public class OrderHeaderServiceImpl extends BaseServiceImpl<OrderHeader> implements IOrderHeaderService {
	
	@Autowired
	private OrderHeaderMapper orderHeaderMapper;
	
	
	@Override
	public List<OrderHeader> selectByOrderHeader(IRequest requestContext, OrderHeader orderHeader, int page,
			int pagesize) {
		PageHelper.startPage(page, pagesize);
		
		//List<OrderHeader> list = orderHeaderMapper.selectByOrderHeader(orderHeader);
		//System.out.println("====================================="+ list.get(0).getCompanyName());
		return orderHeaderMapper.selectByOrderHeader(orderHeader);
	}

	@Override
	//@Transactional这个注解表示此方法运用事务
	//SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 
	@Transactional(propagation = Propagation.SUPPORTS)
    public List<OrderHeader> batchUpdate(IRequest requestContext, List<OrderHeader> headers) {
        // TODO Auto-generated method stub
        for (OrderHeader header : headers) {
            if (header!= null) {
            	System.out.println(header.toString());
            		orderHeaderMapper.insertOrderHeader(header);
                }
            }
        return headers;
    }


	

}
