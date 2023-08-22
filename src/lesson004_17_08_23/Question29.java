package lesson004_17_08_23;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan iki sayı ile hesap makinesi +-/* işlemleri yaptıralım.
		
		Scanner scanner=new Scanner(System.in);
		
		/*System.out.println("1.sayıyı giriniz");
		double sayi1=scanner.nextDouble();
		System.out.println("Hangi işlemi yaptırmak istiyorsunuz");
		String islem=scanner.next();
		System.out.println("2.sayıyı giriniz");
		double sayi2=scanner.nextDouble();
		
		double sonuc;
		
		switch (islem) {
		case "+":
			sonuc=sayi1+sayi2;
			System.out.println("Toplamları:"+sonuc);
			break;
		case "-":
			sonuc=sayi1-sayi2;
			System.out.println("Farkları:"+sonuc);
			break;
		case "*":
			sonuc=sayi1*sayi2;
			System.out.println("Çarpımları:"+sonuc);
			break;
		case "/":
			sonuc=sayi1/sayi2;
			System.out.println("Bölümleri:"+sonuc);
			break;
		default:
			System.out.println("Geçerli işlem yapınız");
			break;
		}
		*/
		
		
		
		//Kullanıcı 0 girene kadar toplama çıkarma yaptıralım
		
		System.out.println("İşlem yapılacak sayıyı giriniz");
		double sayi3=scanner.nextDouble();
		System.out.println("Hangi işlemi yaptırmak istiyorsunuz");
		String islem1=scanner.next();
		
		double sonuc1=0;
		
		while(sayi3!=0) {
				switch(islem1) {
				case "+":
					sonuc1+=sayi3;
					break;
				case "-":
					sonuc1-=sayi3;
					break;
				default:
					System.out.println("Geçerli işlem yapınız");
					break;
			}
				System.out.println("Sonuc:"+sonuc1);
				System.out.println("Sayı ekleyin");
				sayi3=scanner.nextDouble();
				System.out.println("İşlem seçiniz");
				islem1=scanner.next();
		}
	}
}
