package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� �ϼ��� : ");
		int a = sc.nextInt();
		int b = 0;
		for (int i = 0; i<=a; i++) {
			b +=i;
		}
		System.out.println(b);
	}

}
