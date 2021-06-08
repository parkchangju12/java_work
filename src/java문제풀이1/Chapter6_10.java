package java문제풀이1;
import java.util.Scanner;
import java.util.Random;
public class Chapter6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int [] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.println(a[i]);
		}
		sc.close();
		
	}

}
