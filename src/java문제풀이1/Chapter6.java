package java����Ǯ��;

import java.util.Scanner;

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = new int[2];
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a < b) {
        	int c = a;
        	a = b;
        	b = c;
        }
        System.out.println("ū��: "+a);
        System.out.println("������: "+b);
        
	}
 }
