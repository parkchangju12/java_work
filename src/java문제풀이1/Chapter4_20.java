package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i; 
		int choice = 1;
		do {
			System.out.print("�޿��� �Է��ϼ��� : ");
			i = sc.nextInt();
			if (1<=i && i<=12) {
				if (i==1 || i==2 || i==12) System.out.println("�ܿ� �Դϴ�.");
				else if (3<=i && i<=5) System.out.println("�� �Դϴ�.");
				else if (6 <=i && i<=8) System.out.println("���� �Դϴ�.");
				else if (9<=i && i<=11) System.out.println("���� �Դϴ�.");
				do {
					System.out.print("�ٽ� �Ͻðڽ��ϱ�? (yes:1, no:0)");
					choice = sc.nextInt();
					if (choice !=1 && choice !=0) {
						System.out.println("�ٽ��Է��ϼ���");
					}
				}while(choice!=1 && choice!=0);
			}
			else System.out.println("�ٽ��Է��ϼ���");
				
		}while(choice!=0);
		sc.close();
	}

}
