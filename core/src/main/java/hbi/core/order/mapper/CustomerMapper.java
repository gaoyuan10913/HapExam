package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.Company;
import hbi.core.order.dto.Customer;

public interface CustomerMapper extends Mapper<Customer>{
	List<Customer> selectByCustomer(Company company);
	
	int insertCompany(Customer customer);
	
    int updateFruit(Customer customer);
    
    int deleteFruit(Customer customer);
}
