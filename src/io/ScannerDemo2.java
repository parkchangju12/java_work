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
			System.out.println("띡");
			b =+ sc.nextInt();
			System.out.println("띡");
			c =+ sc.nextInt();
			System.out.println("띡");

			d =+ sc.nextInt();
			System.out.println(d+"원 받았습니다.");
			money = (d-(a+b+c));
			if (money < 0) {
				System.out.println("잔액이 부족 합니다...");
				continue;
			}
			
			System.out.println("거스름 돈은 "+money+" 원 입니다.");
		}
		sc.close();

	}

}
