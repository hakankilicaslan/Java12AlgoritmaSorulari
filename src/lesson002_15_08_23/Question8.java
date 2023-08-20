package lesson002_15_08_23;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenarları girilen üçgenin nasıl bir üçgen olduğunu bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int kenar1, kenar2, kenar3;
		
		System.out.println("Ilk kenari giriniz:");
		kenar1=scanner.nextInt();
		System.out.println("Ikinci kenari giriniz:");
		kenar2=scanner.nextInt();
		System.out.println("Ucuncu kenari giriniz:");
		kenar3=scanner.nextInt();
		
		if(kenar1>0 && kenar2>0 && kenar3>0) {
			if(kenar1==kenar2 && kenar2==kenar3) 
				System.out.println("Eskenar ucgendir");
			else if(kenar1==kenar2 || kenar2==kenar3 || kenar1==kenar3)
				System.out.println("Ikizkenar ucgendir");
			else 
				System.out.println("Cesitkenar ucgendir");
		}else 
			System.out.println("Pozitif deger giriniz");
  }
}
