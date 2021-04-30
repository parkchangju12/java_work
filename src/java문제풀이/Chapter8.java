package java문제풀이;

import java.util.Scanner;

public class Chapter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3-9번문제
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i > 0) {
			if (i % 10 ==0) {
				System.out.println("10의 배수 입니다.");
			}
			else if (i % 10 != 0) {
				System.out.println("10의 배수가 아닙니다.");
				
			}
		}
		else if (i < 0) {
			System.out.println("음의 정수값을 입력 했습니다.");
		}
		
//		3-10번 문제
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a % 3 ==0) {
				System.out.println("이 값은 3으로 나누어 집니다.");
			}
			else if (a % 3 ==1) {
				System.out.println("이 값을 3으로 나눈 나머지는 1 입니다.");
			}
			else if (a % 3 ==2) {
				System.out.println("이 값을 3으로 나눈 나머지는 2 입니다.");
			}
		}
		else if (a <0) {
			System.out.println("양수가 아닌 값을 입력 했습니다.");
		}
	}

}
