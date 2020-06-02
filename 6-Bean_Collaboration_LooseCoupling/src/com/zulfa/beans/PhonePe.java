package com.zulfa.beans;

public class PhonePe implements Payment {
public PhonePe() {
	System.out.println("PhonePe.Constructor()");
}
	@Override
	public String paymentService(int oid) {
		return "PhonePe is used to purchase orderid " + oid ;
	}

}
