package com.zulfa.beans;

public class GooglePay implements Payment {
public GooglePay() {
	System.out.println("GooglePay.Constructor()");
}
	@Override
	public String paymentService(int oid) {
		return "GooglePay is used to purchase orderid: " + oid ;
	}

}
