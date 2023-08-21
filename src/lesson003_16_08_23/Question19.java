package lesson003_16_08_23;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		
		// Girilen sayının 5'in kuvveti olup olmadığını while döngüsüyle bulalım.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayıyı giriniz:");
		int sayi=scanner.nextInt();
		
		boolean kontrol=true;
		
		while(kontrol==true) {
			if(sayi%5==0) {
				sayi=sayi/5;
				if(sayi==1) {
					System.out.println("Girilen sayı 5'in kuvvetidir");
					kontrol=false;
				}
			}else {
				System.out.println("Girilen sayı 5'in kuvveti değildir");
				kontrol=false;
			}
		}
	}
}
