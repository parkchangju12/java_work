package java����Ǯ��1;
import java.util.Scanner;
public class Chapter7_4 {
	static int sumUp(int n) {
		int result=0;
		for (int i=1; i<=n; i++) {
			result+=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		System.out.println(num+"������ ��: "+sumUp(num));
	}

}
