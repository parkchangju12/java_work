package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ� : ");
		int a = sc.nextInt();
		
		for (int i = -2; i<a; i++) {
			for(int j =0; j<a; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		sc.close();
//		�Է�:3
	}

}
