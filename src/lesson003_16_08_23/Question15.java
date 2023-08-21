package lesson003_16_08_23;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		  /*
		  Koç Burcu : 21 Mart - 20 Nisan 
		  Boğa Burcu : 21 Nisan - 21 Mayıs 
		  İkizler Burcu: 22 Mayıs - 22 Haziran
		  Yengeç Burcu : 23 Haziran - 22 Temmuz 
		  Aslan Burcu : 23 Temmuz - 22 Ağustos 
		  Başak Burcu : 23 Ağustos - 22 Eylül 
		  Terazi Burcu : 23 Eylül - 22 Ekim 
		  Akrep Burcu : 23 Ekim - 21 Kasım 
		  Yay Burcu : 22 Kasım - 21 Aralık
		  Oğlak Burcu : 22 Aralık - 21 Ocak
		  Kova Burcu : 22 Ocak - 19 Şubat
		  Balık Burcu : 20 Şubat - 20 Mart
		  */
		
		  //12 şubat doğumlu için switch-case kullanalım.
		  //Kullanıcıdan 1 ile 12 arası bir sayı isteyelim.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kaçıncı ayda doğdunuz:");
		int ay=scanner.nextInt();
		System.out.println("Kaçıncı günde doğdunuz:");
		int gun=scanner.nextInt();
		
		
		switch (ay) {
		case 1:
			if(gun<=21)
				System.out.println("Oğlak burcusunuz.");
			else
				System.out.println("Kova burcusunuz.");
			break;
		case 2:
			if(gun<=19)
				System.out.println("Kova burcusunuz.");
			else
				System.out.println("Balık burcusunuz.");
			break;
		default:
			System.out.println("Ay değerini yanlış girdiniz");
			break;
		}
 }
}
