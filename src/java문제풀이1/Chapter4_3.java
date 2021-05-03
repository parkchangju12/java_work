package java문제풀이1;
import java.util.Random;
import java.util.Scanner;
public class Chapter4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		int result = 10 + random.nextInt(90);
		int i;
		
		do {
			System.out.println("수를 입력 하세요");
			i = sc.nextInt();
			if (i==result) {
				System.out.println("정답입니다.");
			}
			else if (i != result) {
				System.out.println("틀렸습니다.");
				if (i < result) {
					System.out.println("더 큰 수 입니다.");
				}
				else if (i > result){
					System.out.println("더 작은 수 입니다.");
				}
			}
		}while(i != result);


	}

}
