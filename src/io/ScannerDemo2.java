package io;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, money;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			if (sc.nextInt() == 0) {
				break;
			}
			a =+ sc.nextInt();
			System.out.println("��");
			b =+ sc.nextInt();
			System.out.println("��");
			c =+ sc.nextInt();
			System.out.println("��");

			d =+ sc.nextInt();
			System.out.println(d+"�� �޾ҽ��ϴ�.");
			money = (d-(a+b+c));
			if (money < 0) {
				System.out.println("�ܾ��� ���� �մϴ�...");
				continue;
			}
			
			System.out.println("�Ž��� ���� "+money+" �� �Դϴ�.");
		}
		sc.close();

	}

}
