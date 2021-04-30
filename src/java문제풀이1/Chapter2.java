package java문제풀이;

import java.util.Scanner;
public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		
		if (a >= b) {
			c =+ (a - b);
			if (c <=10) {
				System.out.println();
			}
		}
		else if (a <= b) {
			c =+ (b - a);
		}
		if (c <=10) {
			System.out.println("두값의 차는 10이하");
		}
		else {
			System.out.println("두값의 차는 11이상");
		}
		sc.close();
	}

}
