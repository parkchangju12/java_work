package java����Ǯ��1;

import java.util.Scanner;
public class Chapter5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		float cnt = 3;
		for (int i =0; i<cnt; i++) {
			System.out.print("�Է� : ");
			int a = sc.nextInt();
			total +=a;
		}
		System.out.println("�հ��? :"+total);
		System.out.println("�����? :"+total/cnt);
		sc.close();
	}

}
