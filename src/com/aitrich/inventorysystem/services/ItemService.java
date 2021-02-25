package com.aitrich.inventorysystem.services;



import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.data.ItemDataAccessObject;
import com.aitrich.inventorysystem.domain.Item;
public class ItemService
{
	private DataAccessObject dao;
	int i =0;
	
	public ItemService(DataAccessObject dao) {
		super();
		this.dao = dao;
	}

	public void addItem(Item item){
		dao.insert(item);
	}
	
	public Item[] findAllItem() {
		DataAccessObject daonew= new ItemDataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\InventorySystem_template.zip_expanded\\InventorySystem_template\\Files\\Item.txt");
	Object[] obj=daonew.findAll();
	Item[] itemarray=new Item[obj.length];
	for(int i=0;i<itemarray.length;i++) {
		itemarray[i]=(Item)obj[i];
//		System.out.println(itemarray[i]);
	}
		return itemarray;
	}
	public void findPrice(int Price) {
		System.out.println("======Reading from the file to greater price ======");
		Item [] price=findAllItem();
		for(int i=0;i<price.length;i++){
			if(Price<price[i].getUnitPrice()) {
				System.out.println(price[i]);
			}
		}
	}
}
