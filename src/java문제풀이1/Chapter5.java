package java문제풀이;

import java.util.Scanner;
public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a;
		int min = b;
		
		if (a < b) {
			max = b; 
			min = a;
		}
		if (a != b) {
			System.out.println("큰값: "+ max);
			System.out.println("작은값: "+ min);
		}
		else {
			System.out.println("같습니다.");
		}
		sc.close();
//		if (a < b) {
//			System.out.println("큰값: "+ b);
//			System.out.println("작은값: "+ a);
//		}
//		else if (a > b) {
//			System.out.println("큰값: "+ a);
//			System.out.println("작은값: "+ b);
//			
//		}
//		else {
//			System.out.println("두 값이 같습니다.");
//		}
		
	}

}
