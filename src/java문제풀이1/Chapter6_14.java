package java문제풀이1;

import java.util.Scanner;
public class Chapter6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int [] a = new int[num];
		int temp = 0;
		int max = num-1;
		for (int i =0; i<num; i++) {
			int n = 11+i;
			a[i] = n;
			System.out.println("a["+i+"] = "+a[i]);
		}

		System.out.println("역순으로 복사");
		for (int i =0; i<num/2; i++) {
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			max--;
			
		}
		for (int i =0; i<num; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		sc.close();
	}

}
