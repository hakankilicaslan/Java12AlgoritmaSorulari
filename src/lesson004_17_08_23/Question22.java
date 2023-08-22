package lesson004_17_08_23;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
		// Girilen sayının asal sayı olup olmadığını bulalım.

		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		
		boolean dogruMu=true;
		
		for (int i = 2; i <sayi; i++) {
			if(sayi%i==0) {
				dogruMu=false;
				break;
			}
		}
		if(dogruMu)
			System.out.println(("Girilen sayı asaldır"));
		else
			System.out.println("Girilen sayı asal değildir");
	}
}
