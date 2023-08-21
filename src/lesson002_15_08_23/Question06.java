package lesson002_15_08_23;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		
		//Kullanıcıdan alınan vize ve final notlarını hesaplayarak geçip geçmediğini kontrol edelim.
		//vize %40, final %60 ve 50ye büyük-eşit geçer 50 altı kalır.
		
		Scanner scanner=new Scanner(System.in);
		
		double vizeNotu, finalNotu, not;
		
		System.out.println("Vize puanını giriniz:");
		vizeNotu=scanner.nextDouble();
		
		System.out.println("Final puanını giriniz:");
		finalNotu=scanner.nextDouble();
				
		if(vizeNotu<0 || vizeNotu>100 || finalNotu<0 || finalNotu>100) {
			System.out.println("Yanlış puan girdiniz");
		}else {
			not=(vizeNotu*0.4)+(finalNotu*0.6);
			
			if(not>=50) 
				System.out.println("Başarılı ortalamanız: " +not);
			else 
				System.out.println("Başarısız ortalamanız: " +not);
		}
 }
}
