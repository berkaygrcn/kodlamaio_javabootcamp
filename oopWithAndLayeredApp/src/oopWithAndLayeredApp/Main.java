package oopWithAndLayeredApp;

import oopWithAndLayeredApp.business.ProductManager;
import oopWithAndLayeredApp.core.logging.DatabaseLogger;
import oopWithAndLayeredApp.core.logging.Logger;
import oopWithAndLayeredApp.core.logging.MailLogger;
import oopWithAndLayeredApp.core.logging.fileLogger;
import oopWithAndLayeredApp.dataAccess.HibarnateProductDao;
import oopWithAndLayeredApp.dataAccess.jdbsProductDao;
import oopWithAndLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1=new Product(1,"Iphone Xr",9000);
		
		Logger[] loggers= {new DatabaseLogger(),new fileLogger(),new MailLogger()};
		ProductManager productManager=new ProductManager(new HibarnateProductDao(),loggers);
		productManager.add(product1);
	}

}
