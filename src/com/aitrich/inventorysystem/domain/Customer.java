package com.aitrich.inventorysystem.domain;

public class Customer {
		private int customerId;
		private String customerName;
		private String address;
		private String emailId;
		public Customer() {
			super();
			this.customerId=0;
			this.customerName=null;
			this.address=null;
			this.emailId=null;
		}
		public Customer(int customerId, String customerName, String address, String emailId) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.address = address;
			this.emailId = emailId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
					+ ", emailId=" + emailId + "]";
		}
		
}
