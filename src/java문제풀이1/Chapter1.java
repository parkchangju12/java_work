package java문제풀이;

import java.util.Scanner;
public class Chapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 a: ");
		double a = sc.nextDouble();
		System.out.println("실수 b: ");
		double b = sc.nextDouble();
		
		if (a > b) {
			System.out.println(a);
		}
		else if (b > a) {
			System.out.println(b);
		}
	}

}
