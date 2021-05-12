package java문제풀이1;

import java.util.Scanner;
public class Chapter4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		System.out.print(a+"의 약수는 : ");
		for (int i=1; i<=a; i++) {
			if (a % i==0) {
				System.out.print(i+" ");
				count +=1;
			}
		}
		System.out.println();
		System.out.println("약수의 갯수는 : "+count);
	}

}
