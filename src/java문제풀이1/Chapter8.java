package java����Ǯ��;

import java.util.Scanner;
public class Chapter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch(month) {
		case 12,1,2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3,4,5:
			System.out.println("�� �Դϴ�.");
			break;
		case 6,7,8:
			System.out.println("���� �Դϴ�.");
			break;
		case 9,10,11:
			System.out.println("���� �Դϴ�.");
			break;
		default:
			System.out.println("�߸��Է� �Ͽ����ϴ�.");
		sc.close();
		}

	}

}
