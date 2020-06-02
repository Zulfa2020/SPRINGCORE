package com.zulfa.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
private Payment pay;
public Flipkart() {
System.out.println("Flipkart.Constructor()");	
}
public void setPay(Payment pay) {
	System.out.println("Flipkart.setPay()");
	this.pay = pay;
}

public String purchase(String[] items,float[] price) {
	//generate order id
	Random rad=new Random();
	float bill=0.0f;
	int orderid=rad.nextInt(700000);
	
	for(float amount : price) {
		bill=bill+amount;
	}
	//deliver order
	String status=pay.paymentService(orderid);
	
	return status + " \nOrder id : "+orderid+ "\nItems: " + 
	                  Arrays.deepToString(items) + "\nPrices: " + Arrays.toString(price) + "\nBillAmount: " + bill;
}//method

}//class
