package com.bhatiya.ref;

public class RefA {
	private int x;
	private RefB b;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public RefB getB() {
		return b;
	}
	public void setB(RefB b) {
		this.b = b;
	}
	public RefA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RefA [x=" + x + ", b=" + b + "]";
	}
	
	

}
