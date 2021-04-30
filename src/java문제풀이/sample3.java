package java문제풀이;

import java.util.Random;

public class sample3 {

	public static void main(String[] args) {
		Random random = new Random();
		int n1 = 1 + random.nextInt(9);
		int n2 = -1 - random.nextInt(9);
		int n3 = 10 + random.nextInt(90);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

}
