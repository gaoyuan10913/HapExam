package hbi.core.order.dto;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

public class OrderStatus extends BaseDTO {

	private static final long serialVersionUID = 7352231565850185972L;

	@NotEmpty
	private Long codeValueId;

	@NotEmpty
	private Long codeId;

	@NotEmpty
	private String meaning;

	@NotEmpty
	private String description;

	public Long getCodeValueId() {
		return codeValueId;
	}

	public Long getCodeId() {
		return codeId;
	}

	public String getMeaning() {
		return meaning;
	}

	public String getDescription() {
		return description;
	}

	public void setCodeValueId(Long codeValueId) {
		this.codeValueId = codeValueId;
	}

	public void setCodeId(Long codeId) {
		this.codeId = codeId;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
