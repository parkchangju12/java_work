package java문제풀이1;
import java.util.Scanner;

public class Chapter7_23 {
	
	static int[] removeArray(int [] a, int index) {
		if (index<0 || index > a.length) {
			return a;
		}
		else {
//			배열생성
			int [] b = new int [a.length-1];
//			b의 배열 위치 변수
			int j=0;
//			a배열을 b배열에 넣어줌
			for (int i =0; i<a.length; i++) {
				if (i==index) {
					i+=1;
				}
				b[j] = a[i];
				j+=1;
			}
//			리턴
			return b;
		}
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
		
//		배열 위치
		System.out.print("인덱스: ");
		int index = sc.nextInt();
		
		a = removeArray(a,index);
		
//		출력
		for (int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]: "+a[i]);
		}
	}

}
