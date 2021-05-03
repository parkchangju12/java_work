package java문제풀이;

import java.util.Random;
import java.util.Scanner;

public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = 10 + random.nextInt(90);
		int away = random.nextInt(11);
		int i;
		
		do {
			System.out.println("수를 입력 하세요\n");
			i = sc.nextInt();
			if (i==result) {
				System.out.println("정답입니다.\n");
			}
			else if (i != result) {
				System.out.println("틀렸습니다.\n");
				if (i < result) {
					System.out.println("더 큰 수 입니다.\n");
				}
				else if (i > result){
					System.out.println("더 작은 수 입니다.\n");
				}
				System.out.println("수가 도망 갑니다.\n");
				result = result+away;
			}
			if (result > 100) {
				System.out.println("졌습니다....");
				i = result;
			}
		}while(i != result);
		sc.close();
		
	}

}
