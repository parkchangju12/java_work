package java����Ǯ��;
import java.util.Scanner;
public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("b�� ũ��");
		}
		else if (a > b) {
			System.out.println("a�� ũ��");
		}
		else if (a == b) {
			System.out.println("a�� b�� ����");
		}
		sc.close();
	}

}
