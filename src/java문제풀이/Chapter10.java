package java문제풀이;

import java.util.Scanner;

public class Chapter10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		if (a<=c && c<=b) {
//			int num = b;
//			b = c;
//			c = num;
//		}
//		else if (b <= a && a <=c) {
//			int num = b;
//			b = a;
//			a = num;
//		}
//		else if ( b<=c && c<=a) {
//			int num = b;
//			b = c;
//			c = a;
//			a = num;
//			
//		}
//		else if (c <= a && a<=b) {
//			int num = b;
//			b = a;
//			a = c;
//			c =num;
//			
//		}
//		else if (c<=b && b<=a) {
//			int num = c;
//			c = a;
//			a = num;
//		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

//		if (a>b) {
//			int temp=a;
//			a=b;
//			b=temp;
//		}
//
//		if (b>c) {
//			int temp = b;
//			b = c;
//			c = temp;
//		}
//		if (a>b) {
//			int temp = a;
//			a = b;
//			b = temp;
//		}
		
		
		int[] num = new int[3];
		for (int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i=0; i < num.length; i++) {
			
			for (int j=i+1; j < num.length; j++) {
				
				if (num[i]>num[j]) {
					
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
	}
}

