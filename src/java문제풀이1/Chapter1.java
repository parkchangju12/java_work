package java����Ǯ��;

import java.util.Scanner;
public class Chapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ� a: ");
		double a = sc.nextDouble();
		System.out.println("�Ǽ� b: ");
		double b = sc.nextDouble();
		
		if (a > b) {
			System.out.println(a);
		}
		else if (b > a) {
			System.out.println(b);
		}
	}

}
