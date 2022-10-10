package oopWithAndLayeredApp.dataAccess;

import oopWithAndLayeredApp.entities.Product;

public class jdbsProductDao implements ProductDao {

	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
