package java����Ǯ��1;

import java.util.Scanner;
public class Chapter4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int cnt=0;
		do {
			System.out.print("�Է� : ");
			a = sc.nextInt();
			for (int i = 1; i<=a; i++) {
				if (a % i == 0) {
					cnt+=1;
				}
			}
			if (cnt==2) {
				System.out.println(a+" �� �Ҽ� �Դϴ�.");
			}
			else {
				System.out.println(a+" �� �Ҽ��� �ƴմϴ�.");
			}
		}while(cnt!=2);
		sc.close();
		System.out.println("��");
	}

}
