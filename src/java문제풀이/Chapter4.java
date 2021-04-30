package java문제풀이;

import java.util.Scanner;

public class Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c [];
		if (sc.nextInt() % sc.nextInt() == 0) {
			System.out.println("B는 A의 약수 이다.");
		}
		else if (sc.nextInt()%sc.nextInt() !=0) {
			System.out.println("B는 A의 약수가 아니다.");
		}

	}

}
