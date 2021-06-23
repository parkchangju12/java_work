package java문제풀이1;
import java.util.Random;
import java.util.Scanner;
public class Chapter7_8 {
	static int random(int a, int b) {
		Random rand = new Random();
		int result;
		if (b>a) {
			result = rand.nextInt(b-a+1)+a;
		}
		else {
			result = a;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("난수생성");
		System.out.print("최솟값: ");
		int a = sc.nextInt();
		System.out.print("최댓값: ");
		int b = sc.nextInt();
		System.out.println("랜덤값: "+random(a,b));
	}

}
