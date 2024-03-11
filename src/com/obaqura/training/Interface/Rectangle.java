package com.obaqura.training.Interface;

public class Rectangle implements Polygon {

	

	@Override
	public void getArea(int l, int b) {
		int area=l*b;
		System.out.println("Print the Area " +area);
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Rectangle v=new Rectangle();
		v.getArea(10, 20);
		// TODO Auto-generated method stub

	}
}
