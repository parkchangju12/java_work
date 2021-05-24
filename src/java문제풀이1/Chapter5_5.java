package java문제풀이1;

import java.util.Scanner;
public class Chapter5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total = 0;
		float cnt = 3;
		for (int i =0; i<cnt; i++) {
			System.out.print("입력 : ");
			int a = sc.nextInt();
			total +=a;
		}
		System.out.println("합계는? :"+total);
		System.out.println("평균은? :"+total/cnt);
		sc.close();
	}

}
