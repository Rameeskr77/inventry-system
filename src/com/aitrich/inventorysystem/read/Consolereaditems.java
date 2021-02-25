package com.aitrich.inventorysystem.read;

import java.util.Scanner;

import com.aitrich.inventorysystem.domain.Item;

public class Consolereaditems {
	private Scanner consolereadr;
	public Item bildItems() {
		consolereadr=new Scanner(System.in);
		Item item = new Item();
		askItemNo(item);
		askItemName(item);
		askUnitPrice(item);
		return item;
	}
	public void askItemNo(Item item) {
		try {
			System.out.println("Enter the Item No");
		item.setItemNo(consolereadr.nextInt());
		if(item.getItemNo()==0 ) {
			askItemNo(item);
			System.out.println("You have entered an invalid value!");
		}
		} catch (Exception e) {
			System.out.println("Incorrect data");
			item.setItemNo(0);
		}
		System.out
		.println("==================================================================================");
	}
	public void askItemName(Item item) {
		try {
			System.out.println("Enter the ItemName");
		item.setIteName(consolereadr.next());
		if(item.getIteName()==null|| item.getIteName().trim().equals("")) {
			askItemName(item);
			System.out.println("You have entered an invalid value!");
		}
		} catch (Exception e) {
			System.out.println("Incorrect data");
			item.setIteName(null);
		}
		System.out
		.println("==================================================================================");
	}
	public void askUnitPrice(Item item) {
		try {
			System.out.println("Enter the UnitPrice");
		item.setUnitPrice(consolereadr.nextInt());
		if(item.getUnitPrice()==0 ) {
			askUnitPrice(item);
			System.out.println("You have entered an invalid value!");
		}
		} catch (Exception e) {
			System.out.println("Incorrect data");
			item.setUnitPrice(0);
		}
		System.out
		.println("==================================================================================");
	}
}
