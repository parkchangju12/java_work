package java����Ǯ��;
import java.util.Scanner;
public class Chapter4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int again = 0;
		do {
			System.out.println("���ڸ� ���� ���� �Է��ϼ���: ");
			num = sc.nextInt();
			if (100 <= num && num <= 999) {
				System.out.println(num);
			}
			else {
				System.out.println("�ٽ��Է��ϼ���");
				again = num;
			}
			
		}while(again == num);
		
	}

}
