package java문제풀이;

import java.util.Scanner;
public class Chapter9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if (0 <= i && i<= 49) {
			System.out.println("가");
		}
		else if (50 <= i && i <= 59) {
			System.out.println("양");
		}
		else if (60 <= i && i <= 69) {
			System.out.println("미");
		}
		else if (70 <= i && i <= 79) {
			System.out.println("우");
		}
		else if (80 <= i && i <= 100) {
			System.out.println("수");
		}
		else {
			System.out.println("잘못된 점수 입니다.");
		}
		sc.close();
	}

}
