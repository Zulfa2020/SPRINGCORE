package com.zulfa.beans;

public class DTDC implements Courier {
   public DTDC() {
System.out.println("DTDC 0-param Constructor");
   }
	@Override
	public final String deliver(int orderid) {
		return "DTDC is ready to deliver products of orderid = "+orderid;
	}

}
