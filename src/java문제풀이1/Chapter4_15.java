package java문제풀이1;

import java.util.Scanner;

public class Chapter4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		
		for (int i =1; i<=a; i++) {
			result +=i;
			if (i<a) {
				System.out.print(i+"+");
			}
			else if (i==a) {
				System.out.println(i+"="+result);
			}
		}
		sc.close();
	}

}
