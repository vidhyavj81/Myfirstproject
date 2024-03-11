package com.obsqura.training.Aggregation3;

public class Book {
String bookName;
int bookPrice;
Author add;

	public Book(String bookName, int bookPrice, Author add) {
	super();
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	this.add = add;
}
void display() {
	System.out.println(bookName+" "+bookPrice);
	System.out.println(add.authorName+" "+add.age+" "+add.place);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Author a=new Author("Murthy",60,"Kochi");
Book b=new Book("Happiness",300,a);
b.display();

	}

}
