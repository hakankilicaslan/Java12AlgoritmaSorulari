package lesson001_14_08_23;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		//Verilen isim ve soyisim değerlerini hoşgeldiniz isim soyisim şeklinde yazdıralım.

		Scanner scanner=new Scanner(System.in);
		String isim, soyIsim;
		System.out.println("İsim giriniz");
		isim=scanner.next();
		
		System.out.println("Soyisim giriniz");
		soyIsim=scanner.next();	
		
		System.out.println("Hoşgeldiniz: " + isim + soyIsim);
  }
}
