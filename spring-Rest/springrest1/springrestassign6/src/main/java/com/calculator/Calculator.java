package com.calculator;

public class Calculator {
	private long a;
	private long b;
	
	public Calculator (){

	}
	public void setA(long a) {
		this.a = a;
	}
	public void setB(long b) {
		this.b = b;
	}
	public long getA() {
		return a;
	}
	public long getB() {
		return b;
	}
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + "]";
	}
	
	
}


