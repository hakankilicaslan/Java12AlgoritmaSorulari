package lesson003_16_08_23;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		
		// Girilen sayının hangi basamağında hangi sayı olduğunu while döngüsüyle bulalım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int basamakSayisi=1;
		int basamak;
		
		while(sayi!=0) {
			basamak=sayi%10;
			sayi/=10;
			System.out.println(basamakSayisi+".ler basamağı: "+basamak);
			basamakSayisi*=10;
		}
    }
}
