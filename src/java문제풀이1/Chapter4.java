package java문제풀이;

import java.util.Scanner;
public class Chapter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
		
//		if (a <= b && a <= c) {
//			if (b <= c) {
//				System.out.println(b);
//			}
//			else if (b >= c) {
//				System.out.println(c);
//			}
//		}
//		else if (b <= a && b <= c){
//			if (a <= c) {
//				System.out.println(a);
//			}
//			else if (a >= c) {
//				System.out.println(c);
//			}
//		}
//		else if (c <= a && c <= b){
//			if (a <= b) {
//				System.out.println(a);
//			}
//			else if (a >= b) {
//				System.out.println(b);
//			}
			
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int middle = a;
		
	      if ((a>=b && b>=c) || (c>=b && b>=a)) middle = b;
	      if ((a>=c && c>=b) || (b>=c && c>=a)) middle = c;
	      System.out.println(middle);
	      sc.close();
	
	
		
	}	

}
