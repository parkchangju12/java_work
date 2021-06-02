package java문제풀이1;
import java.util.Scanner;
public class Chapter6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		
		int [] a = new int[num];
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] =");
			int b = sc.nextInt();
			a[i] = b;
		}
		for (int j=0; j<a.length; j++) {
			if (j==0) {
				System.out.print("a = {");
			}
			System.out.print(a[j]);
			if (0<=j && j<a.length-1) {
				System.out.print(",");
			}
			if (j==a.length-1) {
				System.out.println("}");
			}
		}
		sc.close();
		
	}

}
