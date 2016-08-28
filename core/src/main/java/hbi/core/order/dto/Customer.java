package hbi.core.order.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_ar_customers")
public class Customer extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6100022666809558005L;

	@Id
	@Column
	@GeneratedValue
	private Long customerId;

	@Column
	@NotEmpty
	private String customerNumber;

	@Column
	@NotEmpty
	private String customerName;

	@Column
	@NotEmpty
	private Long companyId;

	@Column
	@NotEmpty
	private String enabledFlag;

	public Long getCustomerId() {
		return customerId;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
