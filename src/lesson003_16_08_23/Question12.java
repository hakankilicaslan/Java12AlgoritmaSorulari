package lesson003_16_08_23;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		//Girilen iki sayının toplamı çiftse true tekse false yazdıralım.
		//String boolean kullanalım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz:");
		int sayi1=scanner.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		int sayi2=scanner.nextInt();
		boolean ciftMi=true;
		int toplam=sayi1+sayi2;
		
		if(toplam%2==0) {
			ciftMi=true;
		}else {
			ciftMi=false;
		}
		System.out.println(ciftMi);	
 }
}
