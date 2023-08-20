package lesson001_14_08_23;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		//Verilen ürün satış fiyatının içinde %18 KDV ve %15 kar olduğunu biliyoruz.
		//Verilen ürün fiyatının ham fiyatını bulalım.

		Scanner scanner=new Scanner(System.in);	
		
		int fiyat;
		double hamFiyat;
		
		System.out.println("Urun fiyatini giriniz");
		fiyat=scanner.nextInt();
		
		hamFiyat=fiyat/(1.18*1.15);
		
		System.out.println("Urunun hamfiyati: " +hamFiyat);
  }
}
