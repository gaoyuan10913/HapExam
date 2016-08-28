package hbi.core.order.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.hand.hap.system.dto.BaseDTO;

@Table(name = "hap_inv_inventory_items")
public class InventoryItem extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7848758194461483487L;

	@Id
	@Column
	@GeneratedValue
	private Long inventoryItemId;

	@Column
	@NotEmpty
	private String itemCode;

	@Column
	@NotEmpty
	private String itemUom;

	@Column
	@NotEmpty
	private String itemDescription;

	@Column
	@NotEmpty
	private String orderFlag;

	@Column
	@NotNull
	private Date startActiveDate;

	@Column
	@NotNull
	private Date endActiveDate;

	@Column
	@NotEmpty
	private String enabledFlag;

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public String getItemUom() {
		return itemUom;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public String getOrderFlag() {
		return orderFlag;
	}

	public Date getStartActiveDate() {
		return startActiveDate;
	}

	public Date getEndActiveDate() {
		return endActiveDate;
	}

	public String getEnabledFlag() {
		return enabledFlag;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public void setItemUom(String itemUom) {
		this.itemUom = itemUom;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setOrderFlag(String orderFlag) {
		this.orderFlag = orderFlag;
	}

	public void setStartActiveDate(Date startActiveDate) {
		this.startActiveDate = startActiveDate;
	}

	public void setEndActiveDate(Date endActiveDate) {
		this.endActiveDate = endActiveDate;
	}

	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}

}
