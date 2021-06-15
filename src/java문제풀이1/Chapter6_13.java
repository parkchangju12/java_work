package java문제풀이1;

import java.util.Scanner;
import java.util.Random;
public class Chapter6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("요소 수: ");
		int num = sc.nextInt()+1;
		int [] a = new int[num];
		int sf=0;
		for (int i =0; i<num; i++) {
			a[i] = rand.nextInt(100)+1;
			System.out.println("a["+i+"]= "+a[i]);
		}
		System.out.println("요소를 섞었음");
		for(int i=0; i<num; i++) {
			int b = rand.nextInt(num);
			int c = rand.nextInt(num);
			sf = a[b];
			a[b] = a[c];
			a[c] = sf;

		}
		for (int i=0; i<num; i++) {
			System.out.println("a["+i+"]= "+a[i]);
		}
		sc.close();
		
	}

}
