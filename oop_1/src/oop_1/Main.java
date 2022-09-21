package oop_1;

import oop1.Product;

public class Main {

	String message="vade oranı";
	Product product=new Product();
	
	//set value
	product.name="Delonghi Kahve Makinesi";
	product.unitPrice=7500;
	product.discount=7;
	product.unitsInStock=3;
	product.imageUrl="bilmemne.jpg";
	//get
	System.out.println(message);
}
