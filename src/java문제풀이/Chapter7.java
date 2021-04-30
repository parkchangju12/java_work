package java문제풀이;
import java.util.Scanner;
public class Chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if (a > 0) {
			if (a % 5==0) {
				System.out.println("5로 나누어 떨어집니다.");
			}
			else if (a % 5 != 0) {
				System.out.println("5로 나누어 떨어지지 않습니다.");
		
			}
		}
		else if (a<0) {
			System.out.println("음의 정수값을 입력했습니다.");
		}
		sc.close();

		
	}

}
