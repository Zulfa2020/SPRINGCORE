package com.zulfa.beans;

public class BlueDart implements Courier {
public BlueDart() {
	System.out.println("Blue Dart 0-param Constructor");
}
	@Override
	public final String deliver(int orderid) {
		return "Blue Dart is ready to deliver products of orderid = "+orderid;
	}

}
