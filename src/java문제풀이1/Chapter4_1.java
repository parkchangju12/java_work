package java����Ǯ��;
import java.util.Scanner;
public class Chapter4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, again;
//		while (true) {
//			System.out.println("�������� �Է� �ϼ���:");
//			int i = sc.nextInt();
//			if (i<0) {
//				System.out.println("�� ���� ���� �Դϴ�.");
//			}
//			else if (0<i) {
//				System.out.println("�� ���� ��� �Դϴ�.");
//			}
//			else {
//				System.out.println("�� ���� 0 �Դϴ�.");
//			}
//			System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�? (Yes: 1, No: 2)");
//			int again = sc.nextInt();
//			if (again == 1) {
//				continue;
//			}
//			else if (again == 2) {
//				break;
//				
//		
//			}
//		}

		do{
			System.out.println("�������� �Է��ϼ���: ");
            num = sc.nextInt();
            if (num<0) System.out.println("���� �Դϴ�.");
            else if (num>0) System.out.println("��� �Դϴ�.");
            else System.out.println("0 �Դϴ�.");
            System.out.println("�ٽ� �ѹ� �Է��Ͻðڽ��ϱ�?  (Yes: 1, No: 2)");
            again = sc.nextInt();
  
        }while(again != 2);

        System.out.println("��");
	}

}
