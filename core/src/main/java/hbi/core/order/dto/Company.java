package hbi.core.order.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_org_companys")
public class Company extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1106137308201122690L;

	@Id
	@Column
	// 标识主键，但是主键自增
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;

	@Column
	@NotEmpty
	private String companyNumber;

	@Column
	@NotEmpty
	private String companyName;

	@Column
	@NotEmpty
	@Condition(exclude = true)
	private String enabledFlag;

	public Long getCompanyId() {
		return companyId;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
