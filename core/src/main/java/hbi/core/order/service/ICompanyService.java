package hbi.core.order.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hbi.core.order.dto.Company;

public interface ICompanyService extends IBaseService<Company>, ProxySelf<ICompanyService>{
	
    List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize);
    
    List<Company> batchUpdate(IRequest requestContext, @StdWho List<Company> companys);
	
}
