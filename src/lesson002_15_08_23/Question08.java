package lesson002_15_08_23;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int kenar1, kenar2, kenar3;
		
		System.out.println("İlk kenarı giriniz:");
		kenar1=scanner.nextInt();
		System.out.println("İkinci kenarı giriniz:");
		kenar2=scanner.nextInt();
		System.out.println("Üçüncü kenarı giriniz:");
		kenar3=scanner.nextInt();
		
		if(kenar1>0 && kenar2>0 && kenar3>0) {
			if(kenar1==kenar2 && kenar2==kenar3) 
				System.out.println("Eşkenar üçgendir");
			else if(kenar1==kenar2 || kenar2==kenar3 || kenar1==kenar3)
				System.out.println("İkizkenar üçgendir");
			else 
				System.out.println("Çeşitkenar üçgendir");
		}else 
			System.out.println("Pozitif değer giriniz");
  }
}
