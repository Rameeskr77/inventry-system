package com.aitrich.inventorysystem.main;

import com.aitrich.inventorysystem.data.CustomerDataAccessObject;
import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.data.ItemDataAccessObject;
import com.aitrich.inventorysystem.domain.Customer;
import com.aitrich.inventorysystem.domain.Item;
import com.aitrich.inventorysystem.read.Consoleread;
import com.aitrich.inventorysystem.read.Consolereaditems;
import com.aitrich.inventorysystem.services.CustomerService;
import com.aitrich.inventorysystem.services.ItemService;

public class Inventry {

	public static void main(String[] args) {
////		customer
		Consoleread consoleread=new Consoleread();
		DataAccessObject dao=new CustomerDataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\InventorySystem_template.zip_expanded\\InventorySystem_template\\Files\\Customers.txt");
	    CustomerService cs= new CustomerService(dao);
	    Customer customer= consoleread.bildCustomer();
		cs.addCustomer(customer);
		cs.findAllCustomers();
		
		
//		Items
		Consolereaditems consolereaditems= new Consolereaditems();
    	 Item item=consolereaditems.bildItems();
		 DataAccessObject doaitem=new ItemDataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\InventorySystem_template.zip_expanded\\InventorySystem_template\\Files\\Item.txt");
		 ItemService itemservice=new ItemService(doaitem);
		 itemservice.addItem(item);
		 itemservice.findAllItem();
		 cs.findlatter();
		itemservice.findPrice(150);
	}

}
