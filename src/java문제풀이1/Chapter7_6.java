package java����Ǯ��1;
import java.util.Scanner;
public class Chapter7_6 {
	
	static void printSeason(int m) {
		switch(m) {
			case 12,1,2:
				System.out.println("�ܿ�");
				break;
			case 3,4,5:
				System.out.println("��");
				break;
			case 6,7,8:
				System.out.println("����");
				break;
			case 9,10,11:
				System.out.println("����");
				break;
			default:
				System.out.println("�ƹ��͵� ǥ������ ����");
				break;
		}

	}
	static void printSeason1(int m) {
		if (m>=1 && m<=2 || m==12) {
			System.out.println("�ܿ�");
			}
		else if (2<m && m<6) {
			System.out.println("��");
			}
		else if (5<m && m<9) {
			System.out.println("����");
			}
		else if (8<m && m<12) {
			System.out.println("����");
			}
		else {
			System.out.println("�ƹ��͵� ǥ������ ����");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int num = sc.nextInt();
		printSeason(num);
		printSeason1(num);
	}

}
