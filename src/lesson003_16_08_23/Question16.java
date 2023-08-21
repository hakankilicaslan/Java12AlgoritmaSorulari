package lesson003_16_08_23;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		
		// Kullanıcıdan 1 ile 7 arası gün sayısı alalım.
		//Günün hafta içi mi hafta sonu mu o9lduğunu switch-case ile yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Gün sayısını giriniz:");
		int gun=scanner.nextInt();
		
		switch (gun) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta içi");
			break;
		case 6, 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Hatalı değer girdiniz");
			break;
		}
  }
}
