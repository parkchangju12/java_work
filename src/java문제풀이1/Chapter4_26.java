package java����Ǯ��1;
import java.util.Scanner;
public class Chapter4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double result = 0;
		int total=0;
		do {
			System.out.print("��� ������ ���ұ��? : ");
			a = sc.nextInt();
			for (int i =1; i<=a; i++) {
				System.out.print("���� �Է�(����:0) : ");
				b = sc.nextInt();
				if (b==0) {
					i = a;
				}
				total +=1;
				result+=b;
			}
			System.out.println("�հ� : "+ result);
			System.out.println("��� : "+ result/(total-1));
			result=0;
		}while(b!=0);

		
	}

}
