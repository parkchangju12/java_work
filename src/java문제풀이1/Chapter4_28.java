package java����Ǯ��1;
import java.util.Scanner;
public class Chapter4_28 {

//	�������� �Է¹޾Ƽ� ������ �ƴ� ���� �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�(for ��)
//	�Է¹��� ������ ������ ����� ���Ҷ� �����Ͻÿ�(hint : Continue)
//	��� ���ұ��? 3
//	�����Է�:2
//	���� �Է�: -5
//	������ �������ʽ��ϴ�.
//	�����Է�:11
//	�հ谡 13
//	����� 6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ���ұ��? :");
		int Cnt = sc.nextInt();
		int num;
		int total=0;
		for (int i=1; i<=Cnt; i++) {
			System.out.print("���� �Է�: ");
			num = sc.nextInt();
			total+=num;
			if (num<0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				total-=num;
				i-=1;
			}
		}
		System.out.println("�հ谡 "+total);
		System.out.println("����� "+total/Cnt);

	}

}
