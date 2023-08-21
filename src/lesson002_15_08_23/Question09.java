package lesson002_15_08_23;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		
		//Girilen ortalamanın harf notuna göre geçip geçmediğini bulalım.
		//90 üstü AA, 80 ve 90 arası BB, 70 ve 80 arası CC, 60 ve 70 arası DD, 60tan küçükse FF kaldınız.
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Not ortalamasını giriniz:");
		double ortalama=scanner.nextDouble();
		
		if(ortalama>=0 && ortalama<=100) {
			if(ortalama>=90)
				System.out.println("Notunuz:AA Geçtiniz");
			else if(ortalama>=80)
				System.out.println("Notunuz:BB Geçtiniz");
			else if(ortalama>=70)
				System.out.println("Notunuz:CC Geçtiniz");
			else if(ortalama>=60)
				System.out.println("Notunuz:DD Geçtiniz");
			else if(ortalama<60)
				System.out.println("Notunuz:FF Kaldınız");
		}else 
			System.out.println("Ortalama 0 ile 100 arasında olmalı");
  }
}
