package java문제풀이1;

import java.util.Scanner;

public class Chapter4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <=a; i++) {
			System.out.println(i+"의 제곱은 "+i*i+"입니다.");
		}
		sc.close();
	}

}
