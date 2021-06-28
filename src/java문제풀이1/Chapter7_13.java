package java문제풀이1;

import java.util.Scanner;

public class Chapter7_13 {
	
	static String printBits(int x) {
		String result;
		result = Integer.toBinaryString(x);
		return result;
	}

	static void set(String result, int pos) {
		StringBuffer sb = new StringBuffer();
		sb.append(result);
		sb.replace((result.length()-pos)-1, result.length()-pos, "1");
		System.out.println(sb);
	}
	
	static void reset(String result, int pos) {
		StringBuffer sb = new StringBuffer();
		sb.append(result);
		sb.replace((result.length()-pos)-1, result.length()-pos, "0");
		System.out.println(sb);
	}
	
	static void inverse(String result, int pos) {
		StringBuffer sb = new StringBuffer();
		sb.append(result);
		if (result.substring(pos,pos+1).equals("0")) {
			sb.replace((result.length()-pos)-1, result.length()-pos, "1");
			System.out.println(sb);
		}
		else if (result.substring(pos,pos+1).equals("1")) {
			sb.replace((result.length()-pos)-1, result.length()-pos, "0");
			System.out.println(sb);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 x의 pos 번째 비트를 변경합니다.");
		
		System.out.print("x: ");
		int x = sc.nextInt();
		
		System.out.print("pos: ");
		int pos = sc.nextInt();
		
		String result = printBits(x);
		
		System.out.println(result.length());
		
		System.out.print("x         = "+result);
		System.out.println();
		System.out.print("set()     = ");
		set(result,pos);
		System.out.print("reset()   = ");
		reset(result,pos);
		System.out.printf("inverse() = ");
		inverse(result,pos);
	}

}
