package java문제풀이1;
import java.util.Scanner;
public class Chapter7_7 {

	static void putChar(String c, int n) {
		for (int i=1; i<=n; i++) {
			for(int j=0; j < i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	static void putStars(int n) {
		String c = "*";
		putChar(c, n);
		
	}
	static void putDollars() {
		String c = "$";
		int n = 7;
		putChar(c, n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수: ");
		int num = sc.nextInt();
		putStars(num);
		putDollars();
		sc.close();
	}

}
