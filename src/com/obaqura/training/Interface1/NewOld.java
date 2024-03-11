package com.obaqura.training.Interface1;

public class NewOld implements Interfacenew, Interfaceold {

	

	@Override
	public void display() {
		System.out.println("My name is Vidhya Vijay.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println("I'm an Automation Tester.");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		NewOld v=new NewOld();
		v.display();
		v.print();
		// TODO Auto-generated method stub

	}
}
