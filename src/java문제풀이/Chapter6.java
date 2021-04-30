package java문제풀이;
import java.util.Scanner;
public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.println("b가 크다");
		}
		else if (a > b) {
			System.out.println("a가 크다");
		}
		else if (a == b) {
			System.out.println("a와 b가 같다");
		}
		sc.close();
	}

}
