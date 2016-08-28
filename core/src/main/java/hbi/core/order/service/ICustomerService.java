package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hbi.core.order.dto.Customer;

public interface ICustomerService extends IBaseService<Customer>, ProxySelf<ICustomerService>{

	public List<Customer> selectByCustomer(IRequest requestContext, Customer customer, int page, int pagesize);
}
