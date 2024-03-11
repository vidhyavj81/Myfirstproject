package com.obsqura.training.Aggregation;

public class LineItem {
	int qua;
	Product add;
public LineItem(int qua, Product add) {
		super();
		this.qua = qua;
		this.add = add;
	}
void display() {
	
	System.out.println(+qua);
	System.out.println(add.id+" "+add.desc+" "+add.name);
}

public static void main(String args[]) {
	Product product1=new Product(1,"medicine","vidhya");
	LineItem l1=new LineItem(1,product1);
	l1.display();
}
	
}
