package java����Ǯ��1;
import java.util.Scanner;
public class Chapter7_20 {

	static void exchangeArray(int [] a, int [] b) {
//		��ȯ�� ������ ����
		int status;
//		�ݺ��� ũ�⸦ �����ִ� ���� �ʱ⿣ a�� �迭�� ũ�⸦ �־��ش�.
		int num=a.length;
//		�迭�� �ݺ����� �� �迭�� ũ�Ⱑ ���� �迭�� �ݺ��� ���־�� �۵��Ͽ� a�� b���� Ŭ ��쿣 num�� b�� ũ�⸦ �־��ش�.
		if (a.length>b.length) {
			num=b.length;
		}
//		a�� b�� ��ȯ
		for (int j=0; j<num; j++) {
			status = a[j];
			a[j] = b[j];
			b[j] = status;
		}
		
//		a�� b �迭 ���
		System.out.println("�迭 a�� b�� ��ü ��Ҹ� ��ȯ");
		for (int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			System.out.println(a[i]);
		}
		
		for (int i = 0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			System.out.println(b[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭 a�� ��� ��: ");
//		�迭�� ũ�⸦ ������
		int n = sc.nextInt();
		int [] a = new int[n];
//		�迭�� ũ�⸸ŭ �ݺ� �Ͽ� a �迭�� ���ڸ� �־���
		for (int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("�迭 b�� ��� ��: ");
//		�迭�� ũ�⸦ ������
		n = sc.nextInt();
		int [] b = new int[n];
//		�迭�� ũ�⸸ŭ �ݺ� �Ͽ� b �迭�� ���ڸ� �־���
		for (int i = 0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			b[i] = sc.nextInt();
		}
		exchangeArray(a,b);
		sc.close();
	}

}
