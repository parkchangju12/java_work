package java����Ǯ��1;
import java.util.Random;
import java.util.Scanner;
public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = 10 + random.nextInt(90);
		int i;
		
		do {
			System.out.println("���� �Է� �ϼ���");
			i = sc.nextInt();
			if (i==result) {
				System.out.println("�����Դϴ�.");
			}
			else if (i != result) {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				if (i < result) {
					System.out.println("�� ū �� �Դϴ�.");
				}
				else if (i > result){
					System.out.println("�� ���� �� �Դϴ�.");
				}
			}
		}while(i != result);


	}

}
