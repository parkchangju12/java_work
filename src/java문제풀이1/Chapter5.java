package java����Ǯ��;

import java.util.Scanner;
public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		int min = b;
		
		if (a < b) {
			max = b; 
			min = a;
		}
		if (a != b) {
			System.out.println("ū��: "+ max);
			System.out.println("������: "+ min);
		}
		else {
			System.out.println("�����ϴ�.");
		}
		sc.close();
//		if (a < b) {
//			System.out.println("ū��: "+ b);
//			System.out.println("������: "+ a);
//		}
//		else if (a > b) {
//			System.out.println("ū��: "+ a);
//			System.out.println("������: "+ b);
//			
//		}
//		else {
//			System.out.println("�� ���� �����ϴ�.");
//		}
		
	}

}
