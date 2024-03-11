package com.obaqura.training.Interface2;

public class HDFC implements RBI {

	@Override
	public void recurringDeposit(int amount, int duration) {
		   double total=(amount*interest)*duration;   //20000*.05=1000
		  //int totals= total*d;	//1000*5=5000
			
			double balance = total+amount;	//5000+20000=25000
			
		System.out.println(" Total balance"+balance);
		// TODO Auto-generated method stub
		
	}
public static void main (String args[])
{
HDFC v=new HDFC();
v.recurringDeposit(20000, 5);
}
}
