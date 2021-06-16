package java문제풀이1;

import java.util.Scanner;
public class Chapter6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a;
		int [][] b;
		int [][] result;
		a = new int[4][3];
		b = new int[3][4];
		result = new int[a.length][b[0].length];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<a.length; i++) {
			for(int j=0;j<b.length;j++) {
				for (int k=0; k<a[0].length; k++)
				System.out.print("a["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}//a
		for (int i = 0; i<b.length; i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.print("b["+i+"]["+j+"] = ");
				b[i][j] = sc.nextInt();
			}
		}//b
		
		for (int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				for (int k=0; k<a[0].length; k++) {
					result[i][j] += (a[i][k]*b[k][j]);
				}
				
			}
		}//result
		
		for (int i = 0; i<result.length; i++) {
			System.out.println();
			for(int j=0;j<result.length;j++) {
				System.out.printf("%5d",result[i][j]);
			}
		}//result
		sc.close();
		

		
		
		
	}

}
