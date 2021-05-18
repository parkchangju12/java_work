package java문제풀이1;
import java.util.Scanner;
public class Chapter4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		double result = 0;
		int total=0;
		do {
			System.out.print("몇개의 정수를 더할까요? : ");
			a = sc.nextInt();
			for (int i =1; i<=a; i++) {
				System.out.print("정수 입력(종료:0) : ");
				b = sc.nextInt();
				if (b==0) {
					i = a;
				}
				total +=1;
				result+=b;
			}
			System.out.println("합계 : "+ result);
			System.out.println("평균 : "+ result/(total-1));
			result=0;
		}while(b!=0);

		
	}

}
