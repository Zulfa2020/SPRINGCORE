package com.zulfa.beans;

import java.util.Random;

public class Flipkart {

	 private Courier courier;
	 public Flipkart() {
		 System.out.println("Flipkart 0-param Constructor");
	}

	public void setCourier(Courier courier) {
		System.out.println("Flipkart setCourier(-)");
		this.courier = courier;
	}
	public String purchase(String items[]) {
		//generate orderid
		Random rad=new Random();
		int orderid=rad.nextInt(700000);
		//deliver order
		String status=courier.deliver(orderid);
		return status + " \nBill Amount for order id "+orderid + " = 7000";
	}//method
	 
}//class
