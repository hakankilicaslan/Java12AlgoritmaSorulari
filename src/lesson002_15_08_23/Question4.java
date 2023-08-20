package lesson002_15_08_23;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		// Verilen iki sayıdan hangisinin büyük olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi1, sayi2;
		
		System.out.println("Ilk sayiyi giriniz:");
		sayi1=scanner.nextInt();

		System.out.println("Ikinci sayiyi giriniz:");
		sayi2=scanner.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println("Buyuk olan sayi: " + sayi1);
		}else if(sayi1==sayi2){
			System.out.println("Sayilar esittir:");
		}
		else {
			System.out.println("Buyuk olan sayi: " + sayi2);
		}
  }
}
