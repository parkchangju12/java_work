package java문제풀이1;

import java.util.Scanner;

public class Chapter4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		int count = 0 ;
		do {
			System.out.print("양의 정수 값: ");
			a = sc.nextInt();
			b = a;
			for (int i =10; b>0; count++) {
				b = b/i;
			}
		}while(a <=0);
		System.out.println("자릿수: "+count);
		sc.close();
		
		
		
	}
}
