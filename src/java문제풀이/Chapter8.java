package java����Ǯ��;

import java.util.Scanner;

public class Chapter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3-9������
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i > 0) {
			if (i % 10 ==0) {
				System.out.println("10�� ��� �Դϴ�.");
			}
			else if (i % 10 != 0) {
				System.out.println("10�� ����� �ƴմϴ�.");
				
			}
		}
		else if (i < 0) {
			System.out.println("���� �������� �Է� �߽��ϴ�.");
		}
		
//		3-10�� ����
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a % 3 ==0) {
				System.out.println("�� ���� 3���� ������ ���ϴ�.");
			}
			else if (a % 3 ==1) {
				System.out.println("�� ���� 3���� ���� �������� 1 �Դϴ�.");
			}
			else if (a % 3 ==2) {
				System.out.println("�� ���� 3���� ���� �������� 2 �Դϴ�.");
			}
		}
		else if (a <0) {
			System.out.println("����� �ƴ� ���� �Է� �߽��ϴ�.");
		}
	}

}
