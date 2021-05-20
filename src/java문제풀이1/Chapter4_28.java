package java문제풀이1;
import java.util.Scanner;
public class Chapter4_28 {

//	정수값을 입력받아서 음수가 아닌 값의 합계와 평균을 구하는 프로그램을 작성하시오(for 문)
//	입력받은 음수의 개수는 평균을 구할때 제외하시오(hint : Continue)
//	몇개를 더할까요? 3
//	정수입력:2
//	정수 입력: -5
//	음수는 더하지않습니다.
//	정수입력:11
//	합계가 13
//	평균은 6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개를 더할까요? :");
		int Cnt = sc.nextInt();
		int num;
		int total=0;
		for (int i=1; i<=Cnt; i++) {
			System.out.print("정수 입력: ");
			num = sc.nextInt();
			total+=num;
			if (num<0) {
				System.out.println("음수는 더하지 않습니다.");
				total-=num;
				i-=1;
			}
		}
		System.out.println("합계가 "+total);
		System.out.println("평균은 "+total/Cnt);

	}

}
