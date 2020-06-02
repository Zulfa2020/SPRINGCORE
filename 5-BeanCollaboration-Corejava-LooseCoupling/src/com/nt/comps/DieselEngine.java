package com.nt.comps;

public class DieselEngine implements Engine {
public DieselEngine() {
System.out.println("DieselEngine.0-param()");	
}
@Override
	public String start() {
	System.out.println("DieselEngine.start()");
		return "Engine has started and vehicle is moving";
	}
@Override
	public String stop() {
	System.out.println("DieselEngine.stop()");
		return "Engine has stopped and vehicle is not moving";
	}
}
