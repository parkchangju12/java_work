package java문제풀이1;
import java.util.Scanner;
import java.util.Random;
public class Chapter4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100);
		int cnt = 0;
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		for (int i=6; i>=1; i--) {
			System.out.print("납은 횟수 "+i+"회, 어떤 숫자일까요?: ");
			int a = sc.nextInt();
			cnt += 1;
			if (a < num) {
				System.out.println("더 큰 숫자입니다.");
			}
			else if(a>num) {
				System.out.println("더 작은 숫자 입니다.");
			}
			else {
				System.out.println(cnt+"회만에 맞추었습니다.");
				break;
			}
			if (i<=1) {
				System.out.println(num);
				break;
				
			}
		}
		sc.close();
		
	}

}
