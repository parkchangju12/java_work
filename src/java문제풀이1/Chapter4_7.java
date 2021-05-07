package java문제풀이1;

import java.util.Scanner;
public class Chapter4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개를 표시 할까요? : ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
			System.out.print("+");
		}
		System.out.println();
		int b = sc.nextInt();
	}

}
