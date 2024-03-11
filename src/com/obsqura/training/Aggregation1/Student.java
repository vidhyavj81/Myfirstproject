package com.obsqura.training.Aggregation1;

public class Student {
	int rollno;
	String name;
	Address add;
public Student(int rollno, String name, Address add) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.add = add;
	}

void display() {
	System.out.println(rollno+" "+name);
	System.out.println(add.name+" "+add.city+" "+add.country+" "+add.pincode);
	
}

	public static void main(String[] args) {
		Address address1=new Address("vidhya", "kochi","india", 123);
		Student s1=new Student(1,"vani",address1);
		s1.display();
		
	}

}
