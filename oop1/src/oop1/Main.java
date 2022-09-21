package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String message="vade oranı";
		Product product1=new Product();
		
		product1.name="Delonghi Kahve Makinesi";

		product1.unitPrice=7500.000;
		product1.discount=7.0;
		product1.unitsInStock=3;
		product1.imageUrl="bilmemne1.jpg";
		//get
		
		Product product2=new Product();
		
		product2.name="Smeg Kahve Makinesi";
		product2.unitPrice=6500.000;
		product2.discount=8.0;
		product2.unitsInStock=2;
		product2.imageUrl="bilmemne2.jpg";
		
		
		Product product3=new Product();
		
		product3.name="Kitchen Air Kahve Makinesi";
		product3.unitPrice=4500.000;
		product3.discount=9.0;
		product3.unitsInStock=4;
		product3.imageUrl="bilmemne3.jpg";
		
		Product[] products= {product1,product2,product3};

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.name+"</li>");
		}
		System.out.println("</ul>");

	}
	
	

	

}
