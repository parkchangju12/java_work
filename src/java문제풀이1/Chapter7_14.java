package java문제풀이1;

import java.util.Scanner;

public class Chapter7_14 {
	
	static int[] inputNum(int[] x) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<x.length; i++) {
			System.out.print("x["+i+"]= ");
			x[i] = sc.nextInt();
		}
		return x;
	}
	
	static int sumOf(int[] x) {
		int total = 0;
		for (int i =0; i<x.length; i++) {
			total += x[i];
		}
		return total;
	}
	
	static void printOf(int[] x) {
		for (int i=0; i<x.length; i++) {
			if (i==0) {
				System.out.print("x = [");
			}
			System.out.print(x[i]);
			if (i<x.length-1) {
				System.out.print(",");
			}
			if (i==x.length-1) {
				System.out.println("]");
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 :");
		int n = sc.nextInt();
		int [] x = new int[n];
		
		inputNum(x);
		printOf(x);
		System.out.print("모든 요소의 합은 : ");
		System.out.println(sumOf(x));
	}

}
