package java문제풀이1;

import java.util.Scanner;

public class Chapter4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("양수값 입력 : ");
		a = sc.nextInt();
		for (int i=0; i<=a+1; i++) {
			if (a-i >= 0) {
				System.out.println(a-i);
			}
			else {
				System.out.println("종료후 변수 값 :" + (a-i));
			}
		
		}
//		while (a >=0) {
//			System.out.println(a --);
//			System.out.print("x값"+a);
//		}
//		
//		do {
//			System.out.println(a--);
//			if (a == 0) {
//				System.out.println("종료 후 변수 값"+(a-1));
//			}
//		}while(a == 0);
		
		sc.close();

	}

}
