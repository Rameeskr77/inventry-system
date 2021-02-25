package com.aitrich.inventorysystem.read;

import java.util.Scanner;

import com.aitrich.inventorysystem.domain.Customer;
import com.aitrich.inventorysystem.domain.Item;

public class Consoleread {
private Scanner consolereadr;

public Customer bildCustomer() {
	consolereadr=new Scanner(System.in);
	Customer customer=new Customer();
	askCustomerId(customer);
	askCustomerName(customer);
	askaddress(customer);
	askemail(customer);
	return customer;
}
public void askCustomerId(Customer customer) {
	System.out.println("Enter the CustomerId:");
	customer.setCustomerId(consolereadr.nextInt());
	
		try {
			if(customer.getCustomerId()==0) {
				askCustomerId(customer);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		customer.setCustomerId(0);
		}
		
	System.out.println("==================================================================================");
}
public void askCustomerName(Customer customer) {
	System.out.println("Enter the Customer name:");
	customer.setCustomerName(consolereadr.next()); 
		try {
			if(customer.getCustomerName()==null|| customer.getCustomerName().trim().equals("")) {
				askCustomerName(customer);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		customer.setCustomerName(null);
		}
		
	System.out.println("==================================================================================");
}
public void askaddress(Customer customer) {
	System.out.println("Enter the address");
	customer.setAddress(consolereadr.next()); 
		try {
			if(customer.getAddress()==null|| customer.getAddress().trim().equals("")) {
				askaddress(customer);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		customer.setAddress(null);
		}
		
	System.out.println("==================================================================================");
}
public void askemail(Customer customer) {
	System.out.println("Enter the CustomerEmail");
	customer.setEmailId(consolereadr.next()); 
		try {
			if(customer.getEmailId()==null|| customer.getEmailId().trim().equals("")) {
				askaddress(customer);
				System.out.println("you have typr invalid");
			}	
		} catch (Exception e) {
			System.out.println("Incorrect data");
		customer.setEmailId(null);
		}
		
	System.out.println("==================================================================================");
}
}
