package java����Ǯ��1;

import java.util.Scanner;

public class Chapter4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int result = 1;
		int i = 2;
		do {
			System.out.print("���� ���� �� :");
			a = sc.nextInt();
//			for (int i = 1; i<=a; i++) {
//				result *=i;
//			}
			while (i<=a) {
				result *=i;
				i++;
			}
		}while(a<=0);
		System.out.println("��� : "+result);
		sc.close();
		
	}

}
