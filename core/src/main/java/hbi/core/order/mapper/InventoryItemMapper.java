package hbi.core.order.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hbi.core.order.dto.InventoryItem;

public interface InventoryItemMapper extends Mapper<InventoryItem>{
	
	List<InventoryItem> selectByInventoryItem(InventoryItem item);
	
	int insertCompany(InventoryItem item);
	
    int updateFruit(InventoryItem item);
    
    int deleteFruit(InventoryItem item);

}
