package lesson002_15_08_23;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		//Girilen sayının tek mi çift mi olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		
		System.out.println("Sayiyi giriniz:");
		sayi=scanner.nextInt();
		
		if(sayi%2==0) 
			System.out.println("Girilen sayi cifttir");
		else 
			System.out.println("Girilen sayi tektir");
  }
}
