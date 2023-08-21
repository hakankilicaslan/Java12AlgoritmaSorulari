package lesson002_15_08_23;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		
		//Girilen sayının tek mi çift mi olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		
		System.out.println("Sayıyı giriniz:");
		sayi=scanner.nextInt();
		
		if(sayi%2==0) 
			System.out.println("Girilen sayı çifttir");
		else 
			System.out.println("Girilen sayı tektir");
  }
}
