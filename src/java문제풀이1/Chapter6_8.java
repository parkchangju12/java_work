package java����Ǯ��1;
import java.util.Scanner;
public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int num = sc.nextInt();
		int [] a = new int[num];
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("ã�� ����:");
		int find = sc.nextInt();
		for(int j=0; j<a.length; j++) {
			if (find==a[j]) {
				cnt = j;
			}
			
		}
		System.out.println("ã�� ���ڴ� a["+cnt+"]�� �ֽ��ϴ�.");
		sc.close();
	}

}
