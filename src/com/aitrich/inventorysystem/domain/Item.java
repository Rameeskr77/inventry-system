package com.aitrich.inventorysystem.domain;

public class Item {
	private int ItemNo;
	private String IteName;
	private int UnitPrice;
	public Item() {
		super();
		this.ItemNo=0;
		this.IteName=null;
		this.UnitPrice=0;
	}
	public Item(int itemNo, String iteName, int unitPrice) {
		super();
		ItemNo = itemNo;
		IteName = iteName;
		UnitPrice = unitPrice;
	}
	public int getItemNo() {
		return ItemNo;
	}
	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}
	public String getIteName() {
		return IteName;
	}
	public void setIteName(String iteName) {
		IteName = iteName;
	}
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Item [ItemNo=" + ItemNo + ", IteName=" + IteName + ", UnitPrice=" + UnitPrice + "]";
	}
	
}
