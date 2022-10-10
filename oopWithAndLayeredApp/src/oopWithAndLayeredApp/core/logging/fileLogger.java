package oopWithAndLayeredApp.core.logging;

public class fileLogger implements Logger {

	@Override
	public void log(String data) {

		System.out.println("Dosyaya loglandı :"+data);
		
	}

}
