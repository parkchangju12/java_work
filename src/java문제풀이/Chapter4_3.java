package java����Ǯ��;

import java.util.Random;
import java.util.Scanner;

public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = 10 + random.nextInt(90);
		int away = random.nextInt(11);
		int i;
		
		do {
			System.out.println("���� �Է� �ϼ���\n");
			i = sc.nextInt();
			if (i==result) {
				System.out.println("�����Դϴ�.\n");
			}
			else if (i != result) {
				System.out.println("Ʋ�Ƚ��ϴ�.\n");
				if (i < result) {
					System.out.println("�� ū �� �Դϴ�.\n");
				}
				else if (i > result){
					System.out.println("�� ���� �� �Դϴ�.\n");
				}
				System.out.println("���� ���� ���ϴ�.\n");
				result = result+away;
			}
			if (result > 100) {
				System.out.println("�����ϴ�....");
				i = result;
			}
		}while(i != result);
		sc.close();
		
	}

}
