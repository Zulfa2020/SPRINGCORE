package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comps.Engine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	
	private static Properties props;
	static {
		InputStream ins;
		
	try {
		ins=new FileInputStream("src/com/nt/property/App.properties");
		props=new Properties();
		props.load(ins);
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException ioe) {
		ioe.printStackTrace();
	}
	catch (Exception e) {
	e.printStackTrace();	
	}
}
public static Vehicle  getInstance() {
	Vehicle vehicle=null;
	Engine engg=null;
	try {
		vehicle=(Vehicle)Class.forName(props.getProperty("target.class")).newInstance();
		engg=(Engine)Class.forName(props.getProperty("dependent.class")).newInstance();
		
	vehicle.setEngine(engg);
	}
	catch (InstantiationException e) {
		e.printStackTrace();
	}
	catch (ClassNotFoundException e) {
	e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return vehicle;
}//method
}//class
