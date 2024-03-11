package com.obsqura.training.inheritance;

public class AdditionSub extends Addition {
	
	public boolean Isresult(int a,int b) {
		
		int sum=super.result(a,b);
		System.out.println("Sum of two numbers "+sum);

		
	if(sum%10==0) {
		return true;
		}
	else {
		return false;
	
	}
	}
	public static void main(String[] args) {
		AdditionSub v=new AdditionSub();
		boolean flag=v.Isresult(15,20);
		if(flag==true) {
			System.out.println("Number is divisible");
		}
		else {
			System.out.println("Number is not divisible");
		}
		

	}

}
