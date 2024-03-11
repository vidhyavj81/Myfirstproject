package com.obsqura.training.Aggregation2;


public class Employee {
String empName;
int empId;
Car add;
Bike plus;

	public Employee(String empName, int empId, Car add, Bike plus) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.add = add;
	this.plus = plus;
}

void display() {
	System.out.println(empName+" "+empId);
	
	System.out.println(add.color+" "+add.carName+" "+add.regNo);
	System.out.println(plus.bikeName+" "+plus.regNum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("Blue", "BMW", 123);		
		
		
		
		Bike b=new Bike("Duke", 123);
		Employee ee=new Employee("Vidhya",1,c,b);
		ee.display();
		
		
	}

}
