package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_29 {

//	5���� ������ ������ �׷��� ��ü �հ�(�׷캰 �հ� �ƴ� ��ü �׷��� ��)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	��ü 10���� �׷��� ������ �� �������� Ű����� �Է��Ѵ�. �̶� 99999�� �Է��ϸ� ��ü �Է��� �����ϰ�
//	88888�� �Է��ϸ� ���� �а� �ִ� ������ �Է��� �����Ͻÿ�
//	ex
//	������ ���մϴ�.
//	1�׷�
//	����:5
//	����:3
//	����:2
//	����:4
//	����:8
//	2�׷�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int total = 0;
		System.out.println("������ ���մϴ�.");
		for (int i=1; i<=10; i++) {
			System.out.println(i+"�׷�");
			for (int j=1; j<=5; j++) {
				System.out.print("����: ");
				num = sc.nextInt();
				total+=num;
				if (num==99999) {
					j=6;
					total-=num;
				}
				else if(num==88888) {
					j=6;
					total-=num;
				}
			}
			if (num==99999) {
				i=11;
			}
			
		}
		System.out.println("�հ�� "+total+"�Դϴ�.");
		sc.close();
		
	}
	
	

}
