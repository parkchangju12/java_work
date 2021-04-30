package java문제풀이;

import java.util.Scanner;
public class Chapter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i < 0) {
			System.out.println("음의 값 입니다.");
		}
		else {
			System.out.println("양의 값 입니다.");
		}
		sc.close();
		
	}

}
