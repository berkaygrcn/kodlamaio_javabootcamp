package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugun hava çok güzel";
		String yenimesaj=sehirVer();
		System.out.println(yenimesaj);
		int sayi=topla(5,7);
		System.out.println(sayi);
	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");

	}
	public static void guncelle() {
		System.out.println("Güncellendi");
		return;
				
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	
	public static String sehirVer() {
		return "Ankara";
		
	}
}
