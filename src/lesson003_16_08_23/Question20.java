package lesson003_16_08_23;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		// Girilen sayıya kadar tek olan sayıların toplamını while döngüsüyle bulalım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int sayac=1;
		int toplam=0;
		
		while(sayac<=sayi) {
			if(sayac%2!=0) {
				toplam+=sayac;		
			}sayac++;
		}System.out.println("Girilen tek sayıların toplamı:"+toplam);
	}
}
