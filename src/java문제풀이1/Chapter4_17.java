package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		for��
		for (int i = 0; i<a; i++) {
			if (i %5 ==0) {
				System.out.println();
			}
			System.out.print("*");
		}
//		while ��
//		int i=0;
//		while (i<a) {
//			if (i %5 ==0) {
//				System.out.println();
//			}
//			System.out.print("*");
//			i++;
//		}
//		do {
//			if (i%5==0) System.out.println();
//			System.out.print("*");
//			i++;
//		}while(i!=a);
//		sc.close();
	}

}
