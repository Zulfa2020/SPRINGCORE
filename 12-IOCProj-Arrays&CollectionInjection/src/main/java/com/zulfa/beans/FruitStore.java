package com.zulfa.beans;

import java.util.Properties;

public class FruitStore {
private Properties fruit;
public FruitStore() {
	System.out.println(".........................Properties..........................");
}

public void setFruit(Properties fruit) {
	this.fruit = fruit;
}

@Override
public String toString() {
	return "Fruit= " + fruit + "-->"+fruit.getClass();
}



}
