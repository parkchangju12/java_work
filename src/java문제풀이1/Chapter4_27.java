package java문제풀이1;

import java.util.Scanner;
public class Chapter4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double result = 0;
		int total=0;
		System.out.print("몇개를 더할까요? : ");
		a = sc.nextInt();
		for (int i =1; i<=a; i++) {
			System.out.print("정수 입력 : ");
			b = sc.nextInt();
			total +=1;
			result+=b;
			if (result >=1000) {
				System.out.println("합계가 1000을 넘었습니다.");
				System.out.println("마지막값은 무시합니다.");
				result-=b;
				i = a;
			}
		}
		System.out.println("합계 : "+ result);
		System.out.println("평균 : "+ result/(total-1));
		result=0;
	}

}
