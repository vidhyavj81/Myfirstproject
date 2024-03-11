package com.obsqura.training.inheritance2;
import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	double bp=0.0;
	double dd=0.0;
	double bo=0.0;
	

public void salaryDetails() {
	
System.out.println("Enter the Basic pay");
 this.bp=sc.nextDouble();

System.out.println("Enter the Deduction Amount");
 this.dd=sc.nextDouble();

System.out.println("Enter the Bonus");
 this.bo=sc.nextDouble();

}
	
}

	

	


