package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String message="vade oranı";
		Product product1=new Product();
		
		product1.setName("Delonghi Kahve Mkinesi");
		product1.setDiscount(7.0);
		product1.setUnitPrice(7500.00);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		
		//product1.name="Delonghi Kahve Makinesi";

		//product1.unitPrice=7500.000;
		//product1.discount=7.0;
		//product1.unitsInStock=3;
		//product1.imageUrl="bilmemne1.jpg";
		//get
		
		Product product2=new Product();
		
		product2.setName("Smeg Kahve Mkinesi");
		product2.setDiscount(8.0);
		product2.setUnitPrice(6500.00);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		//product2.name="Smeg Kahve Makinesi";
		//product2.unitPrice=6500.000;
		//product2.discount=8.0;
		//product2.unitsInStock=2;
		//product2.imageUrl="bilmemne2.jpg";
		
		
		Product product3=new Product();
		
		product3.setName("Kitchen Air Kahve Makinesi");
		product3.setDiscount(9.0);
		product3.setUnitPrice(4500.00);
		product3.setUnitsInStock(2);
		product3.setImageUrl("image3.jpg");
		//product3.name="Kitchen Air Kahve Makinesi";
		//product3.unitPrice=4500.000;
		//product3.discount=9.0;
		//product3.unitsInStock=4;
		//product3.imageUrl="bilmemne3.jpg";
		
		Product[] products= {product1,product2,product3};

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+product.getName()+"</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05514445555");
		individualCustomer.setCustomerNumber("33");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("demirog");
		
		CorporateCustomers corporateCustomer=new CorporateCustomers();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customers[] customers= {individualCustomer,corporateCustomer};
	}
	
	

	

}
