package java����Ǯ��1;
import java.util.Scanner;
import java.util.Random;
public class Chapter4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100);
		int cnt = 0;
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("0���� 99������ ���ڸ� ���߼���.");
		for (int i=6; i>=1; i--) {
			System.out.print("���� Ƚ�� "+i+"ȸ, � �����ϱ��?: ");
			int a = sc.nextInt();
			cnt += 1;
			if (a < num) {
				System.out.println("�� ū �����Դϴ�.");
			}
			else if(a>num) {
				System.out.println("�� ���� ���� �Դϴ�.");
			}
			else {
				System.out.println(cnt+"ȸ���� ���߾����ϴ�.");
				break;
			}
			if (i<=1) {
				System.out.println(num);
				break;
				
			}
		}
		sc.close();
		
	}

}
