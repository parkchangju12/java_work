package java문제풀이1;

import java.util.Scanner;

public class Chapter7_21 {

	static int[] cloneArray(int[] a) {
//		b 배열을 생성하여 매개변수 a의 크기를 넣어준다
		int [] b = new int[a.length];
//		b 배열에 0번 부터 b 배열의 크기 만큼 반복문을 돌려준다.
		for (int i = 0; i<b.length; i++) {
			b[i] = a[i];
		}
//		b값을 리턴해준다.
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소 수: ");
//		배열의 크기를 정해줌
		int n = sc.nextInt();
		int [] a = new int[n];
//		배열의 크기만큼 반복 하여 a 배열에 숫자를 넣어줌
		for (int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
//		b값에 cloneArray 메소드 리턴 값을 넣어준다. 
		int [] b= cloneArray(a);
		System.out.println("배열 a를 복사해서 배열 b를 생성");
//		출력
		for (int i =0; i<b.length; i++) {
			System.out.println("b["+i+"]: "+b[i]);
		}
		sc.close();
		
	}

}
