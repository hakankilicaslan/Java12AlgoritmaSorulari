package lesson004_17_08_23;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		
		// Girilen sayı için çarpım tablosunu yazdıralım.
		// Daha sonra da tüm çarpım tablosunu yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		int carpim;
		for (int i = 1; i <=10; i++) {
			carpim=sayi*i;
			System.out.println(sayi+"*"+i+"="+carpim);
		}
		
		
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				carpim=i*j;
				System.out.println(i+"*"+j+"="+carpim);
			}
		}
	}
}
