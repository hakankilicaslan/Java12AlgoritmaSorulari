package lesson001_14_08_23;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		//Kullanıcıdan aldığımız 2 int değeri çarpıp sonucunu yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi1, sayi2, carpim;
			
		System.out.println("İlk sayıyı giriniz:");
		sayi1=scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz:");
		sayi2=scanner.nextInt();
		
		carpim=sayi1*sayi2;
		
		System.out.println("Sayıların çarpımı: " + carpim);
  }
}
