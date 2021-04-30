package javaπÆ¡¶«Æ¿Ã;


import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double pi = 3.1416;
		int r = sc.nextInt();
		System.out.println("∫Œ««:"+(4/3.0)*pi*(r*r*r));
		System.out.println("∞—≥–¿Ã :"+4*pi*(r*r));
		System.out.println("∫Œ««:"+(4/3)*pi*(r*r*r));
		System.out.println("∞—≥–¿Ã :"+4*pi*(r*r));
		sc.close();
		
	}

}
