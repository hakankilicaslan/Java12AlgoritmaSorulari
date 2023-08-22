package lesson004_17_08_23;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		
		
		// Girilen 0 ile 100 arasında 5 adet sayıdan en büyük ve en küçük olanı bulalım.
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for (int i = 1; i <=5 ; i++) {
			System.out.println(i+".sayıyı giriniz");
			sayi=scanner.nextInt();
			if(sayi<0 || sayi>100){
				System.out.println("0 ile 100 arasında değer giriniz");
				i--;
			}else {
					if(sayi>max)
						max=sayi;
					if(sayi<min)
						min=sayi;
				  }
		}System.out.println("En büyük sayı: "+max+" En küçük sayı: "+min);
	}
}
