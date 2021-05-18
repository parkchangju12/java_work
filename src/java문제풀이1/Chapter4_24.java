package java문제풀이1;
import java.util.Scanner;

public class Chapter4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 : ");
		int a = sc.nextInt();
		for (int i =1; i<=a; i++) {
			for (int j = a; j>i; j--) {
				System.out.print(" ");
			}
			for (int b = 1; b<=i; b++) {
				System.out.print(i%10); 
			}
			for (int b = 2; b<=i; b++) {
				System.out.print(i%10);
			}
			System.out.println();

		}
		sc.close();

	}

}
