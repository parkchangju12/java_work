package java문제풀이1;

import java.util.Scanner;
public class Chapter4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 : ");
		int a = sc.nextInt();
		for (int i =1; i<=a; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i >= a) {
				for (int b = a; b<=0; b--) {
					System.out.print("*"); 
				}
			}
		}
		
	}

}
