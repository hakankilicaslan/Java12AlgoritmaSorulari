package lesson005_18_08_23;

public class Question31 {

	public static void main(String[] args) {
		
		//Java,Spring,Podtgre,React Stringini kelime kelime alt alta yazdıralım.
		
		
		String text="Java,Spring,Podtgre,React";
		
		for (int i = 0 ; i <text.length() ; i++) {
			if(text.charAt(i)==',') 
				System.out.println();
			else
				System.out.print(text.charAt(i));
		}
		
		
		/*String text = "Java,Spring,Postgre,React";
			
		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i)==',') {
				System.out.println(text.substring(index, i));
					index = i + 1;
			}
		}
		System.out.println(text.substring(index));
		*/
	}
}
