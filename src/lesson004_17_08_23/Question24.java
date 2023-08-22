package lesson004_17_08_23;

public class Question24 {

	public static void main(String[] args) {
	
		// A'dan Z'ye kadar olan harfleri yazdıralım.
		
		
		for (int i = 65; i <=90; i++) {
			char ch= (char)i;
			System.out.print(ch+" ");
		}
		
		System.out.println("\n"+"*************");
		
		char karakter;
		for (karakter = 'a' ;  karakter <='z' ; karakter++) {
			System.out.print(karakter+" ");
		}
	}
}
