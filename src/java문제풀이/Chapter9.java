package java����Ǯ��;

import java.util.Scanner;
public class Chapter9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if (0 <= i && i<= 49) {
			System.out.println("��");
		}
		else if (50 <= i && i <= 59) {
			System.out.println("��");
		}
		else if (60 <= i && i <= 69) {
			System.out.println("��");
		}
		else if (70 <= i && i <= 79) {
			System.out.println("��");
		}
		else if (80 <= i && i <= 100) {
			System.out.println("��");
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}
		sc.close();
	}

}
