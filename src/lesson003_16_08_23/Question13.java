package lesson003_16_08_23;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		//Telefon ve mail kodu tanımlayacağız.Kullanıcıdan telefona ve maile gelen kodu isteyeceğiz.
		//Eğer kodlar uyuşuyorsa sişteme kayıt oldunuz uyuşmuyorsa ya kodları yanlış girdiniz diyelim.
		
		int telefonKod=123;
		int mailKod=456;
				
		Scanner scanner=new Scanner(System.in);
		System.out.println("Telefonunuza gelen kodu giriniz:");
		int kod1=scanner.nextInt();
		System.out.println("Mailinize gelen kodu giriniz:");
		int kod2=scanner.nextInt();
		
		if(kod1==telefonKod && kod2==mailKod)
			System.out.println("Sisteme kayıt oldunuz.");
		else if(kod1!=telefonKod && kod2==mailKod)
			System.err.println("Telefona gelen kodu yanlış girdiniz");
		else if(kod1==telefonKod && kod2!=mailKod)
			System.err.println("Maile gelen kodu yanlış girdiniz");
		else
			System.err.println("Girdiğiniz kodlar uyuşmuyor");
 }
}
