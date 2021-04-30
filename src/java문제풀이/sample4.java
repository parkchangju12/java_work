package java문제풀이;

import java.util.Random;
import java.util.Scanner;
public class sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int i = sc.nextInt();
		int n1 = i-5 + random.nextInt(11);
		System.out.println(n1);
		
	}

}
