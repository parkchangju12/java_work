package java����Ǯ��1;

import java.util.Scanner;

public class Chapter4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("����� �Է� : ");
		a = sc.nextInt();
		for (int i=0; i<=a+1; i++) {
			if (a-i >= 0) {
				System.out.println(a-i);
			}
			else {
				System.out.println("������ ���� �� :" + (a-i));
			}
		
		}
//		while (a >=0) {
//			System.out.println(a --);
//			System.out.print("x��"+a);
//		}
//		
//		do {
//			System.out.println(a--);
//			if (a == 0) {
//				System.out.println("���� �� ���� ��"+(a-1));
//			}
//		}while(a == 0);
		
		sc.close();

	}

}
