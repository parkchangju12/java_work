package java����Ǯ��1;

import java.util.Scanner;

public class Chapter7_21 {

	static int[] cloneArray(int[] a) {
//		b �迭�� �����Ͽ� �Ű����� a�� ũ�⸦ �־��ش�
		int [] b = new int[a.length];
//		b �迭�� 0�� ���� b �迭�� ũ�� ��ŭ �ݺ����� �����ش�.
		for (int i = 0; i<b.length; i++) {
			b[i] = a[i];
		}
//		b���� �������ش�.
		return b;
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
//		b���� cloneArray �޼ҵ� ���� ���� �־��ش�. 
		int [] b= cloneArray(a);
		System.out.println("�迭 a�� �����ؼ� �迭 b�� ����");
//		���
		for (int i =0; i<b.length; i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}
		sc.close();
		
	}

}
