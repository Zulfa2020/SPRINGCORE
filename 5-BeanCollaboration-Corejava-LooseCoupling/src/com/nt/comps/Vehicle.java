package com.nt.comps;

public class Vehicle {
	private Engine engine;
	public Vehicle() {
	System.out.println("Vehicle.0-param Constructor()");
	}

public void setEngine(Engine engine) {
	System.out.println("Vehicle.setEngine()");
		this.engine = engine;
	}

public void journey(String source, String dest) {
	System.out.println(engine.start());
	System.out.println("Journey started from: "+ source);
	System.out.println("You have reached your destination: "+dest);
	System.out.println(engine.stop());
}
}
