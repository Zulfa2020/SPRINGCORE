package com.nt.comps;

public class PetrolEngine implements Engine {
public PetrolEngine() {
	System.out.println("PetrolEngine.0-param()");
}
@Override
	public String start() {
	System.out.println("PetrolEngine.start()");
		return "Engine has started and vehicle is moving";
	}
@Override
	public String stop() {
	System.out.println("PetrolEngine.stop()");
		return "Engine has stopped and vehicle is not moving";
	}
}
