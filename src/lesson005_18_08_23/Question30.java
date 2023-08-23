package lesson005_18_08_23;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		
		//Girilen kelimenin harflerini for döngüsüyle alt alta yazdıralım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=scanner.next();
		
		for (int i = 0 ; i <= kelime.length()-1 ; i++) {
			System.out.println(kelime.charAt(i));
		}
 }
}
