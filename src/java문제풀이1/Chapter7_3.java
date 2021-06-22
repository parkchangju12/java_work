package java문제풀이1;
import java.util.Scanner;
public class Chapter7_3 {
	
	public static int med(int a, int b, int c) {
		int result=a;
		if (a >= b) {
			if (b >= c) {
				result = b;
			}
			else if (a <= c) {
				result = a; 
			}
			else {
				result = c; 
			}
		} 
	
		else if (a > c) {
			result = a;
		}
		else if (b > c) {
			result = c;
		}
		else {
			result = b;
		}


		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();
		System.out.println("중간값: "+med(a,b,c));
		
	}

}
