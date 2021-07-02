package java문제풀이1;

import java.util.Scanner;

public class Chapter7_26 {

	static int [] insertArrayOf(int[] a, int index, int num) {
		int [] b = new int[a.length+1];
		int j=0;
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			if (i==index) {
				b[j] = num;
				cnt = i;
				j+=1;
				break;
			}
			else {
				b[j] = a[i];
				j+=1;
			}
		}
		for (; j<b.length; j++) {
			b[j] = a[cnt];
			cnt+=1;
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("위치: ");
		int index = sc.nextInt();
		System.out.print("입력 값: ");
		int num = sc.nextInt();
		int [] b = insertArrayOf(a, index, num);
		
		for (int i=0; i<b.length; i++) {
			if (i==0) System.out.print("{");
			System.out.print(b[i]);
			if (i>=0 && i<b.length-1) System.out.print(",");
			if (i==b.length-1) System.out.println("}");
		}
		sc.close();
	}

}
