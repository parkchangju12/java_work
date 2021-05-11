package java문제풀이1;

import java.util.Scanner;
public class Chapter4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		
		for (int i = 0; i<=b; i++) {
			System.out.println(a);
			a--;
		}
	}

}
