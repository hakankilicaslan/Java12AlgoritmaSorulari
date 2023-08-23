package lesson005_18_08_23;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		
		//Girilen kelimenin içinde kaç tane 'e' olduğunu yazdıralım.
		//İkinci seçenekte ise hangi harfi aramamızı istediğini de kullanıcıdan alalım.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Kelime giriniz");
		String kelime=scanner.next();
		int sayac=0;
		
		for (int i = 0; i <= kelime.length()-1; i++) {
			if(kelime.charAt(i)=='e') 
				sayac++;
		}
		System.out.println(sayac+" adet 'e' vardır");
		
		
		/*System.out.println("Kelime giriniz");
		String kelime=scanner.next();
		System.out.println("Aramak istediğiniz harfi giriniz");
		String harf=scanner.next();
		int sayac=0;
		
		for (int i = 0; i <= kelime.length()-1; i++) {
			if(kelime.charAt(i)==harf.charAt(0)) 
				sayac++;
		}
		System.out.println(sayac+" adet "+harf+" vardır");
		*/
  }
}
