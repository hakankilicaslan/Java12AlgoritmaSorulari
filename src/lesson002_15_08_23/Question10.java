package lesson002_15_08_23;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		
		// Girilen 3 sayıdan en büyük olanı bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Ilk sayiyi giriniz:");
		double sayi1=scanner.nextDouble();
		System.out.println("Ikinci sayiyi giriniz:");
		double sayi2=scanner.nextDouble();
		System.out.println("Ucuncu sayiyi giriniz:");
		double sayi3=scanner.nextDouble();
		
		if(sayi1>sayi2 && sayi1>sayi3)
			System.out.println("En buyuk sayi: " +sayi1);
		else if (sayi2>sayi1 && sayi2>sayi3)
			System.out.println("En buyuk sayi: " +sayi2);
		else
			System.out.println("En buyuk sayi: " +sayi3);
	}
}
