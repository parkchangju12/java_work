package java문제풀이1;

import java.util.Scanner;

public class Chapter7_18 {

	static void aryRmv(int [] a, int del) {
		for (int i = 0; i<a.length; i++) {
			if (a[i]==del) {
				for(int j = i; j<a.length-1; j++) {
					a[j]=a[j+1];
				}
			}
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
		
		System.out.print("삭제할 요소의 인덱스: ");
		int del = sc.nextInt();
		
		aryRmv(a,del);
	}

}
