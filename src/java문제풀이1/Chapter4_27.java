package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double result = 0;
		int total=0;
		System.out.print("��� ���ұ��? : ");
		a = sc.nextInt();
		for (int i =1; i<=a; i++) {
			System.out.print("���� �Է� : ");
			b = sc.nextInt();
			total +=1;
			result+=b;
			if (result >=1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�.");
				System.out.println("���������� �����մϴ�.");
				result-=b;
				i = a;
			}
		}
		System.out.println("�հ� : "+ result);
		System.out.println("��� : "+ result/(total-1));
		result=0;
	}

}
