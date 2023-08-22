package lesson004_17_08_23;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		// Girilen 0 ile 100 arasında 5 adet sayıdan en büyük ve en küçük olanı while döngüsüyle bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int j=0;
		
		while(j<5) {
			System.out.println(j+1+".sayıyı giriniz");
			sayi=scanner.nextInt();
			
			if(sayi<0 || sayi>100)
				System.out.println("0 ile 100 arasında değer giriniz");
			else {
			if(sayi>max)
				max=sayi;
			if(sayi<min)
				min=sayi;
			j++;
			}
		}System.out.println("En büyük sayı: "+max+" En küçük sayı: "+min);

	}
}
