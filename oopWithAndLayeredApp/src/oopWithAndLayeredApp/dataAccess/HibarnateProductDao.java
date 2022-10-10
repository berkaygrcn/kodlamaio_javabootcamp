package oopWithAndLayeredApp.dataAccess;

import oopWithAndLayeredApp.entities.Product;

public class HibarnateProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır... SQL
		System.out.println("Hibarnate ile veritabanına eklendi");
	}
}
