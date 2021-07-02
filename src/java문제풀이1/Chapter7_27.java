package java문제풀이1;

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
		System.out.print("int 형 정수 a의 값: ");
		int num = sc.nextInt();
		System.out.print("long 형 정수 b의 값: ");
		long num1 = sc.nextLong();
		System.out.print("float 형 정수 c의 값: ");
		float num2 = sc.nextFloat();
		System.out.print("double 형 정수 d의 값: ");
		double num3 = sc.nextDouble();
		System.out.println("a의 절대값: "+ot.absolute(num));
		System.out.println("b의 절대값: "+ot.absolute(num1));
		System.out.println("c의 절대값: "+ot.absolute(num2));
		System.out.println("d의 절대값: "+ot.absolute(num3));

		sc.close();
	}

}
