package java����Ǯ��1;

import java.util.Scanner;

public class Chapter7_13_test {

	static void printBits(int x) {
		for(int i=31; i>=0; i--) {

			if ((x >>> i&1)==1) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			
		}
	}
	static void set(int x, int pos) {
		for(int i=31; i>=0; i--) {
			if (i==pos) {
				if ((x >>> i&1)==1) {
					System.out.print("1");
				}
				else {
					System.out.print("1");
				}
			}
			else {
				if ((x >>> i&1)==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
		}
	}
	
	static void reset(int x, int pos) {
		for(int i=31; i>=0; i--) {
			if (i==pos) {
				if ((x >>> i&1)==1) {
					System.out.print("0");
				}
				else {
					System.out.print("0");
				}
			}
			else {
				if ((x >>> i&1)==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
		}
	}
	
	static void inverse(int x, int pos) {
		for(int i=31; i>=0; i--) {
			if (i==pos) {
				if ((x >>> i&1)==0) {
					System.out.print("1");
				}
				else if ((x >>> i&1)==1){
					System.out.print("0");
				}
			}
			else {
				if ((x >>> i&1)==1) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("���� x�� pos ��° ��Ʈ�� �����մϴ�.");
		
		System.out.print("x: ");
		int x = sc.nextInt();
		
		System.out.print("pos: ");
		int pos = sc.nextInt();
		
		System.out.print("x         = ");
		printBits(x);
		System.out.println();
		System.out.print("set()     = ");
		set(x,pos);
		System.out.println();
		System.out.print("reset()   = ");
		reset(x,pos);
		System.out.println();
		System.out.printf("inverse() = ");
		inverse(x,pos);
	}

}


/*
0�� 1�� 1�� ����
int x = 5;
int pos = 3
int set(x, position) {
	ret = x | (1 << pos)
			return ret;
}

1�� 0 0�� ����
int x = 5;
int pos = 3
int reset(x, position) {
	ret = x & ~(1 << pos)
			return ret;
}

1�� 0 0�� 1��

int x = 5;
int pos = 3
int inverse(x, position) {
	ret = x ^ (1<<<pos)
			return ret;
}

*/


