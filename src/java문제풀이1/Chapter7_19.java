package java문제풀이1;

import java.util.Scanner;

public class Chapter7_19 {

	static void insertArray(int [] a, int index,int input) {
//		가져온 배열 수 만큼 반복
		for (int i = 0; i<a.length; i++) {
//			i가 입력 받은 배열 위치에 왔을 때
			if (i == index) {
//				배열의 마지막 부터 앞 숫자를 하나씩 가져옴
				for(int j = a.length-1; j>i; j--) {
					a[j]=a[j-1];
				}
//				입력 받은 배열 위치에 입력 수를 넣어 준다
				a[i]=input;
			}
//			출력
			System.out.print("a["+i+"]: ");
			System.out.println(a[i]);
			
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
		
//		배열에 들어갈 수
		System.out.print("번호: ");
		int input = sc.nextInt();
		
		insertArray(a,index,input);
	}

}
