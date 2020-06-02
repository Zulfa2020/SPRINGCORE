package com.nt.exp;

public class Test {
int x,y;
	
	public  Test() {
		System.out.println("Test:: 0-param constructor");
	}
	
	public Test(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("Test:: 2-param constructor");
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}
	
}//class
