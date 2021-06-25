package java문제풀이1;

import java.util.Scanner;

public class Chapter7_12test {

	static void printBits(int x) {
		for (int i=31; i>=0; i--) {
			System.out.println((x >>> i&1)==1? "1":"0");
		}
	}
	
	static int rotateRight(int x, int n) {
		if(n<0) return 
		
	}
	
	static int rotateLeft(int x, int n) {

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		
		String x2 = Integer.toBinaryString(x);
		System.out.println(x2);
		
		sb.append(x2);
		
		
		System.out.print("n: ");
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			for (int j=0; j<x2.length(); j++) {
				if (x2.substring(j,j+1).equals("1")) {
					if ()
					sb.replace(j, j+1,x2.substring(j-1,j));
				}
				else if (x2.substring(j,j+1).equals("0")) {
					sb.replace(j, j+1,"1");
				}
			}
		}
		System.out.println(x2.substring(0,3));
		System.out.println(sb);
		
//		System.out.println("회전 전 = ");
//		System.out.println(rotateRight());
//		System.out.println("오른쪽 회전 = ");
//		System.out.println(rotateRight());
//		System.out.println("왼쪽 회전 = ");
//		System.out.println(rotateLeft());


	}

}
