package java����Ǯ��;
import java.util.Scanner;
public class Chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a % 5==0) {
				System.out.println("5�� ������ �������ϴ�.");
			}
			else if (a % 5 != 0) {
				System.out.println("5�� ������ �������� �ʽ��ϴ�.");
		
			}
		}
		else if (a<0) {
			System.out.println("���� �������� �Է��߽��ϴ�.");
		}
		sc.close();

		
	}

}
