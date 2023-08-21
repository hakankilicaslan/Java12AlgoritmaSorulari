package lesson002_15_08_23;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		//Girilen TL değerini USD ye çevirelim
		
		Scanner scanner=new Scanner(System.in);
		 
		double turkLirasi, dolar, kurDegeri;
		
		kurDegeri=30.05;
		
		System.out.println("TL değerini giriniz:");
		turkLirasi=scanner.nextDouble();
		
		dolar=turkLirasi/kurDegeri;
		
		System.out.println("Dolar değeri: " +dolar);		
  }
}
