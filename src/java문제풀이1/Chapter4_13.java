package java문제풀이1;

import java.util.Scanner;
public class Chapter4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		
		for (int i = 0; i <=a; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
