package lesson001_14_08_23;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//Kullanıcıdan aldığımız 2 int değeri çarpıp sonucunu yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi1, sayi2, carpim;
			
		System.out.println("Ilk sayiyi giriniz:");
		sayi1=scanner.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz:");
		sayi2=scanner.nextInt();
		
		carpim=sayi1*sayi2;
		
		System.out.println("Sayilarin carpimi: " + carpim);
  }
}
