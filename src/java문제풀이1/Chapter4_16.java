package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h_min, h_max,up;
		do {
			System.out.print("�ּ� ���� ���� �Է� �ϼ��� : ");
			h_min = sc.nextInt();
			System.out.print("�ִ� ���� ���� �Է� �ϼ��� : ");
			h_max = sc.nextInt();
			System.out.print("������ : ");
			up = sc.nextInt();
			if (h_min>h_max || up<=0) System.out.println("�ٽ��Է��ϼ���");
			else System.out.println("���");
		}while(h_min > h_max || up <= 0);
		
		System.out.println("���� | ǥ��ü��");
		System.out.println("----------");
		
		for (; h_min <= h_max;) {
			double avg = (h_min -100)* 0.9;
			System.out.println(h_min+" | "+avg);
			h_min +=up;
		}
		
	}

}
