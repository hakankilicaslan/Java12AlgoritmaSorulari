package lesson002_15_08_23;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		// Verilen iki sayıdan hangisinin büyük olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi1, sayi2;
		
		System.out.println("İlk sayıyı giriniz:");
		sayi1=scanner.nextInt();

		System.out.println("İkinci sayıyı giriniz:");
		sayi2=scanner.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println("Büyük olan sayı: " + sayi1);
		}else if(sayi1==sayi2){
			System.out.println("Sayılar eşittir:");
		}
		else {
			System.out.println("Büyük olan sayı: " + sayi2);
		}
  }
}
