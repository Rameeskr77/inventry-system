package com.aitrich.inventorysystem.data;

import com.aitrich.inventorysystem.domain.Customer;

public class CustomerDataAccessObject extends FileDataAccessObject{
	
	
	public CustomerDataAccessObject(String persistenceFilePath) {
		super(persistenceFilePath);
	}
	
	
	@Override
	protected String objectToCSVRecord(Object object) {
//		System.out.println(object);
		Customer cust=(Customer)object;
		StringBuilder bilder=new StringBuilder();
		bilder.append(cust.getCustomerId());
		bilder.append(",");
		bilder.append(cust.getCustomerName());
		bilder.append(",");
		bilder.append(cust.getAddress());
		bilder.append(",");
		bilder.append(cust.getEmailId());
		return new String(bilder);
	}
	@Override
	protected Object csvRecordToObject(String cvsRecord) {
		String[] str=cvsRecord.split(",");
		Customer custnew=new Customer();
		custnew.setCustomerId(Integer.parseInt(str[0]));
		custnew.setCustomerName(str[1]);
		custnew.setAddress(str[2]);
		custnew.setEmailId(str[3]);
		return custnew;
	}
}
