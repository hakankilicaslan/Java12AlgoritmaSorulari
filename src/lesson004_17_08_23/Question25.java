package lesson004_17_08_23;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		// Girilen sayının mükemmel sayı olup olmadığını kontrol edelim.
		//mükemmel sayı kendisi hariç tam bölenlerinin toplamı kendisini veren sayıdır.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int toplam=0;
		
		for (int i = 1; i <sayi; i++) {
			if(sayi%i==0)
			toplam+=i;	
		}
		if(sayi==toplam)
			System.out.println("Girilen sayı mükemmel sayıdır");
		else 
			System.out.println("Girilen sayı mükemmel sayı değildir");
	}
}
