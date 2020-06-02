package com.zulfa.beans;

import java.util.Date;

public class Flipkart {
//fields
	private DTDC_Courier_Service dtdc;
	private Date date;
	public Flipkart(DTDC_Courier_Service dtdc, Date date) {
		this.dtdc = dtdc;
		this.date = date;
	}//parameterized constructor
	public void welcomeMessage(String name) {
		System.out.println(date);
		int hour=date.getHours();
	if(hour<12) {
            System.out.println("Good Morning "+name);
		System.out.println("Welcome To Flipkart");
		}
	else if(hour<16) {
      System.out.println("Good Afternoon "+name);
	System.out.println("Welcome To Flipkart");
	}
	else { 
      System.out.println( "Good Evening "+name);
	System.out.println("Welcome To Flipkart");
	}

	}//method
	
}//class
