package java문제풀이1;

import java.util.Scanner;

public class Chapter7_12 {
	
	static void printBits(int x) {
		for (int i=31; i>=0; i--) {
			System.out.print((x >>> i&1)==1? "1":"0");
		}
	}
	
	static int rotateRight(int x, int n) {
		if(n<0) return rotateLeft(x,-n);
		
		int ret;
		n = n % 32;
		ret = (n==0? x: (x>>n)|(x<<(32-n)));
		return ret;
		
	}
	
	static int rotateLeft(int x, int n) {
		if(n<0) return rotateRight(x,-n);
		
		int ret;
		n = n % 32;
		ret = (n==0? x: x<<n|(x>>>(32-n)));
		return ret;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();
		
		System.out.print("n: ");
		int n = sc.nextInt();

		
		System.out.print("회전 전 = ");
		printBits(x);
		System.out.println();
		System.out.println("오른쪽 회전 = ");
		System.out.println(rotateRight(x,n));
		System.out.println("왼쪽 회전 = ");
		System.out.println(rotateLeft(x,n));


	}

}
