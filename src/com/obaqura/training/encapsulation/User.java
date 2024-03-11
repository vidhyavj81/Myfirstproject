package com.obaqura.training.encapsulation;



public class User {
	//Scanner sc=new Scanner(System.in);
	//int p=sc.nextInt();

public static void main(String args[]) {
	Bank v=new Bank();
	v.setPin(1234);
System.out.println(v.getPin() );
v.validPin();
}
}



