package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.Company;

public interface CompanyMapper extends Mapper<Company>{
	List<Company> selectByCompany(Company company);
	
	int insertCompany(Company company);
	
    int updateFruit(Company company);
    
    int deleteFruit(Company company);
}
