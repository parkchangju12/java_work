package java����Ǯ��1;

import java.util.Scanner;

class OverloadingTestClass{
	int absolute(int x) {
		if (x<0) {
			x*=-1;
		}
		return x;
	}
	long absolute(long x) {
		if (x<0) {
			x*=-1;
		}
		return x;
	}
	float absolute(float x) {
		if (x<0) {
			x*=-1;
		}
		return x;
	}
	double absolute(double x) {
		if (x<0) {
			x*=-1;
		}
		return x;
	}
}

public class Chapter7_27 {

	
	public static void main(String[] args) {
		OverloadingTestClass ot = new OverloadingTestClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("int �� ���� a�� ��: ");
		int num = sc.nextInt();
		System.out.print("long �� ���� b�� ��: ");
		long num1 = sc.nextLong();
		System.out.print("float �� ���� c�� ��: ");
		float num2 = sc.nextFloat();
		System.out.print("double �� ���� d�� ��: ");
		double num3 = sc.nextDouble();
		System.out.println("a�� ���밪: "+ot.absolute(num));
		System.out.println("b�� ���밪: "+ot.absolute(num1));
		System.out.println("c�� ���밪: "+ot.absolute(num2));
		System.out.println("d�� ���밪: "+ot.absolute(num3));

		sc.close();
	}

}
