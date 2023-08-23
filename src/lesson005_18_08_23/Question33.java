package lesson005_18_08_23;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		
		//Kullanıcıdan mail alacağız @hotmail.com ve @outlook.com formata uygundur bunları girmediyse uygun değildir diyerek tekrar mail isteyeceğiz.
		//Mail girildikten sonra şifre ve tekrar şifre girecek şifre 8den küçük olamaz eğer uyuşuyorsa giriş yaptınız diyip mailini gösterecek.
		
		Scanner scanner=new Scanner(System.in);
		boolean mailDogruMu=true, sifreDogruMu=true;
		
		while(mailDogruMu) {
			System.out.println("Mailinizi giriniz");
			String mail=scanner.next();
	  if(mail.indexOf("@hotmail.com")!=-1 || mail.indexOf("@outlook.com")!=-1)
	  //if(mail.substring((mail.length()-12)).equals("@hotmail.com") || mail.substring((mail.length()-12)).equals("@outlook.com"))
	  //İlk kullandığımız if koşulunda maili girdikten sonra ekstra harf ya da karakterler girdiğimizde de kabul ediyor ama etmemesini sağlamalıyız.
	  //İkinci kullandığımız if koşulunda ise maili girdikten sonra tekrar @ sonrası uzantıyı girdiğimizde kabul ediyor ama etmemesini sağlamalıyız.	  
			mailDogruMu=false;
			else
			System.out.println("Mailiniz sistemle uyuşmuyor");
		}
		while(sifreDogruMu) {
			System.out.println("Şifrenizi giriniz");
			String sifre1=scanner.next();
			if(sifre1.length() >= 8) {
				System.out.println("Şifrenizi tekrar giriniz");
				String sifre2=scanner.next();
			if(sifre1.equals(sifre2)) {
				sifreDogruMu=false;
			}else
				System.out.println("Şifreler birbiriyle uyuşmuyor");
			}else
				System.out.println("Girilen şifre en az 8 karakter olmalı");
		}
		System.out.println("Sisteme giriş yaptınız");
  }
}
