package java����Ǯ��1;

import java.util.Scanner;

public class Chapter7_15 {
	
	static int[] minOf(int [][] x) {
		
		int [] min = new int[2];
		
		min[0] = 500;
		min[1] = 500;
		
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length; j++) {
				if (j==0) {
					if (min[j] > x[i][j]) {
						min[j] = x[i][j];
					}
				}
				else {
					if (min[j] > x[i][j]){
						min[j] = x[i][j];
					}
				}
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� ��: ");
		int n = sc.nextInt();
		int [][] x = new int[n][2];
		
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length; j++) {
				if (j==1) System.out.print((i+1)+"�� ����: ");
				else System.out.print((i+1)+"�� ü��: ");
				x[i][j] = sc.nextInt();
			}
		}
		int [] result = new int[2];
		result = minOf(x);
		System.out.println("���� Ű�� ���� ��� ����: "+result[1]);
		System.out.println("���� ���� ����� ü��: "+result[0]);
	}

}
