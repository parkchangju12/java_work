package java문제풀이;
import java.util.Scanner;
public class Chapter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a >0) {
			System.out.println("양수");
		}
		else if (a<0) {
			System.out.println("음수");
		}
		else if (a==0) {
			System.out.println("영");
		}
		
	}

}
