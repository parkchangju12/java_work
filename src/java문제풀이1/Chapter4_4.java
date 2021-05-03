package java문제풀이1;

import java.util.Scanner;

public class Chapter4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,num;
		System.out.print("숫자를 입력 하세요 : ");
		a = sc.nextInt();
		System.out.print("숫자를 입력 하세요 : ");
		b = sc.nextInt();	
		
		if (a > b) {
			num = a;
			a = b;
			b = num;
		}
		for (int i=a; i <= b; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
