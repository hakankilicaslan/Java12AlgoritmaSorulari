package lesson002_15_08_23;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		// Yarıçapı verilen dairenin çevresini ve alanını hesaplayalım.

		Scanner scanner=new Scanner(System.in);
		
		double cevre, alan;
				
		System.out.println("Dairenin yarıçapını giriniz:");
		double yaricap=scanner.nextDouble();
		
		if(yaricap<=0)
			System.out.println("Pozitif bir sayı girmelisiniz");
		else {
		cevre=2*(3.14)*yaricap;
		alan=(3.14)*yaricap*yaricap;
		
		//System.out.println("Dairenin alani: " +alan);
		//System.out.println("Dairenin cevresi: "+cevre);
		System.out.println("Dairenin alanı: " +alan + "\n" + "Dairenin çevresi: "+cevre);
		}
  }
}
