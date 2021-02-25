package com.aitrich.inventorysystem.data;

import com.aitrich.inventorysystem.domain.Item;

public class ItemDataAccessObject extends FileDataAccessObject{

	public ItemDataAccessObject(String persistenceFilePath) {
		super(persistenceFilePath);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected String objectToCSVRecord(Object object) {
		Item item =(Item)object;
		StringBuilder bilder=new StringBuilder();
		bilder.append(item.getItemNo());
		bilder.append(",");
		bilder.append(item.getIteName());
		bilder.append(",");
		bilder.append(item.getUnitPrice());
		return new String(bilder);
	}
	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		Item items=new Item();
		String[] strarray= cvsRecord.split(",");
		items.setItemNo(Integer.parseInt(strarray[0]));
		items.setIteName(strarray[1]);
		items.setUnitPrice(Integer.parseInt(strarray[2]));
		return items;
	}
}
