package java문제풀이;
import java.util.Scanner;
public class Chapter4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int again = 0;
		do {
			System.out.println("세자리 정수 값을 입력하세요: ");
			num = sc.nextInt();
			if (100 <= num && num <= 999) {
				System.out.println(num);
			}
			else {
				System.out.println("다시입력하세요");
				again = num;
			}
			
		}while(again == num);
		
	}

}
