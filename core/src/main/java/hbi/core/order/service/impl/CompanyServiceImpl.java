package hbi.core.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hbi.core.order.dto.Company;
import hbi.core.order.mapper.CompanyMapper;
import hbi.core.order.service.ICompanyService;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<Company> implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    
    
	@Override
	public List<Company> selectByCompany(IRequest requestContext, Company company, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return companyMapper.selectByCompany(company);
	}



}
