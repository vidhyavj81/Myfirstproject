package com.obsqura.training.inheritance2;

public class EmployeeDetails extends Employee {
	double hra=0.0;
	double pf=0.0;
	
	public void salary(){
super.salaryDetails();

		this.hra=bp*(5.0/100);
		System.out.println("Print the hra " +hra);
	
	     this.pf=bp*(20.0/100);
		System.out.println("Print the pf " +pf);

	}
	

	}


