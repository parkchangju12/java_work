package java문제풀이1;
import java.util.Scanner;
public class Chapter7_2 {
	
	public static int min(int a, int b, int c) {
		int result = a;
		
		if (b < result) {
			result = b;
		}
		if(c < result) {
			result = c;
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
		System.out.println("최소값: "+min(a,b,c));
	}

}
