package lesson003_16_08_23;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		
		// Girilen sayının basamaklarının toplamını while döngüsüyle bulalım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int basamak;
		int toplam=0;
						
		while(sayi!=0) {
			toplam=(sayi%10)+toplam;
			sayi/=10;
		}
			System.out.println("Basamaklarının toplamı:"+toplam);
	}
}
