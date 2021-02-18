package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// Bir tane yazmamız yeteerlidir.

		System.out.println("Kelime giriniz");
		String kelime = input.nextLine(); // input.nextLine ile yazdığımız atırın hepsini ekrana yazdırız.
		/*
		 * sc.nextInt(); // Klavyeden Integer bir değer okutabiliriz 
		 * sc.next(); //Klavyeden bir kelime okutabiliriz  
		 * sc.nextLine(); // Klaveyeden girilen satırın tamamını okutabiliriz
		 * 
		 */
		System.out.println("Yazdiginiz kelime:" + kelime);

		System.out.println("Sayi gönder");

		int sayi = 0;
		sayi = input.nextInt();
		System.out.println("Yazdiginiz sayi:" + sayi);

	}

}
