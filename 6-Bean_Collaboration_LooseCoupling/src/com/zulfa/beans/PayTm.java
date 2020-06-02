package com.zulfa.beans;

public class PayTm implements Payment {
public PayTm() {
	System.out.println("PayTm.Constructor()");
}
	@Override
	public String paymentService(int oid) {
		return "PayTm is used to purchase orderid "  + oid ;
	}

}
