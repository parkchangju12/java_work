package java문제풀이1;
import java.util.Scanner;
public class Chapter7_1 {
	
	public static int signOf(int a) {
		int result;
		if (a<0) {
			result = -1;
		}
		else if (a==0) {
			result = 0;
		}
		else {
			result = 1;
		}
		return result;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		System.out.print(signOf(a));
		
	}

}
