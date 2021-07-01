package java문제풀이1;

import java.util.Scanner;

public class Chapter7_24 {

	static int [] searchArrayIdx(int [] a, int num) {
//		b 배열의 크기 값
		int cnt = 0;
//		b 배열의 크기를 정해주는 값
		for (int i =0; i<a.length; i++) {
			if (a[i]==num) {
				cnt  +=1;
			}
		}
//		b 배열 생성
		int [] b = new int[cnt];
//		b 배열의 위치값
		int j = 0;
//		찾는 값이 있을 경우 위치를 b배열에 넣어줌
		for (int i =0; i<a.length; i++) {
			if (a[i]==num) {
				b[j] = i;
				j+=1;
			}
		}
//		리턴
		return b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("찾는 값: ");
		int num = sc.nextInt();
		
		int [] b = searchArrayIdx(a, num);
		
//		출력문
		for (int i=0; i<b.length; i++) {
			if (i==0) System.out.print("{");
			System.out.print(b[i]);
			if (i>=0 && i<b.length-1) System.out.print(",");
			if (i==b.length-1) System.out.println("}");
		}
		sc.close();
	}

}
