package java문제풀이1;

import java.util.Scanner;

public class Chapter4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b;
		//		int a = sc.nextInt();
//		for (int i = 1; i<=a; i++) {
//			if (i < a) {
//				System.out.print("*");
//			}
//			else System.out.println("\n*");
//		}
		do {
			System.out.print("숫자를 입력 하세요: ");
			b = sc.nextInt();
			if(a){for (int i =1; i<=b; i++) {
				System.out.print("*");
			}
		}while(b != -1);
	}
}
