package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class SDPTest {

	public static void main(String[] args) {
		Vehicle vehicle=null;
		
		vehicle=VehicleFactory.getInstance();
		
		vehicle.journey("Nairobi","Mombasa");
	}

}
