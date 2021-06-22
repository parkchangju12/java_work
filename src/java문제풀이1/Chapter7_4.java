package java문제풀이1;
import java.util.Scanner;
public class Chapter7_4 {
	static int sumUp(int n) {
		int result=0;
		for (int i=1; i<=n; i++) {
			result+=i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		System.out.println(num+"까지의 합: "+sumUp(num));
	}

}
