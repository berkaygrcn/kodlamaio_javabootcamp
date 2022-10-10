package oopWithAndLayeredApp.business;

import java.util.List;

import oopWithAndLayeredApp.core.logging.Logger;
import oopWithAndLayeredApp.dataAccess.HibarnateProductDao;
import oopWithAndLayeredApp.dataAccess.ProductDao;
import oopWithAndLayeredApp.dataAccess.jdbsProductDao;
import oopWithAndLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");
			
		}
	
			
			//ProductDao productDao=new jdbsProductDao();
			productDao.add(product);
			
			for(Logger logger:loggers) {  //[db,file,]
				logger.log(product.getName());
			}
			
		
	}
}
