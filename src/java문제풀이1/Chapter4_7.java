package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ǥ�� �ұ��? : ");
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
			System.out.print("+");
		}
		System.out.println();
		int b = sc.nextInt();
	}

}
