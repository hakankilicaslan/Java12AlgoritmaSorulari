package lesson004_17_08_23;

import java.util.Iterator;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		
		//Kullanıcıdan taban ve üs alacağız ve 2 üzeri 5 hesaplanacak.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Taban değerini giriniz:");
		int taban=scanner.nextInt();
		System.out.println("Üs değerini giriniz:");
		int us=scanner.nextInt();
		int carpim=1;
		
		for (int i = 1; i <= us; i++) 
			carpim*=taban;
			System.out.println(taban+" üzeri "+us+" "+carpim+" e eşittir");
	}
}
