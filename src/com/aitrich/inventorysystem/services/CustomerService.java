package com.aitrich.inventorysystem.services;


import com.aitrich.inventorysystem.data.CustomerDataAccessObject;
import com.aitrich.inventorysystem.data.DataAccessObject;
import com.aitrich.inventorysystem.domain.Customer;

public class CustomerService
{
	private DataAccessObject dao;
	
		
	public CustomerService(DataAccessObject dao) {
		super();
		this.dao = dao;
	}

	public void addCustomer(Customer customer){
		dao.insert(customer);
		
	}
	
	public Customer[] findAllCustomers() 
	{
		DataAccessObject dao2=new CustomerDataAccessObject("C:\\Users\\unknown\\eclipse-workspace\\InventorySystem_template.zip_expanded\\InventorySystem_template\\Files\\Customers.txt");
		  Object[] arraynew=dao2.findAll();
		  Customer[] custarray=new Customer[arraynew.length];
		  for (int i=0;i<custarray.length;i++) {
			  custarray[i]=(Customer)arraynew[i];
			  System.out.println(custarray[i]);
		  }
		return custarray;
	}
	public void findlatter() {
//		System.out.println("======Reading Customer Name from the file to Starting latter "+"A"+"======");
		String name;
		Customer[] ca=findAllCustomers();
		for(int i=0;i<ca.length;i++) {
			name=ca[i].getCustomerName();
			if(name.charAt(0)=='S'|| name.charAt(0)=='s') {
				System.out.println(name);
			}
		}
	}
}
