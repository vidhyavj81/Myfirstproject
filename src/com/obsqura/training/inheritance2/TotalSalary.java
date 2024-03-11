package com.obsqura.training.inheritance2;

public class TotalSalary extends EmployeeDetails{

	public void totalPay() {
		
	super.salary();

	double ts=super.bp+super.hra-super.pf-super.dd+super.bo;
	System.out.println("Total Salary"+ts);
	System.out.println("Salary Slip");
	System.out.println("Basic Pay"+bp);
	System.out.println("House rent allowance"+hra);
	System.out.println("Provident fund"+pf);
	System.out.println("Deduction Amount"+dd);
	System.out.println("Bonus"+bo);
	System.out.println("Total Salary by hand"+ts);
}
	public static void main(String[]args) {
		TotalSalary w=new TotalSalary();
		w.totalPay();
	}
	}
