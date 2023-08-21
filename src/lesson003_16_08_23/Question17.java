package lesson003_16_08_23;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		// 1'den 100'e kadar olan sayıları while döngüsüyle yazdıralım.
		
		//Girilen sayıya kadar yazdıralım
		
		int sayac=1;
		int sayi;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		sayi=scanner.nextInt();
		
		while (sayac<=sayi) {
			//System.out.println(sayac);
			System.out.print(sayac+ ",");
			sayac++;
		}
 }
}
