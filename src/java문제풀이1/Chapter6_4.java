package java문제풀이1;
import java.util.Scanner;
import java.util.Random;
public class Chapter6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int cnt = sc.nextInt();
		int [] a = new int[cnt];
		int max=0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = ran.nextInt(10)+1;
			if (a[i] > max) {
				max = a[i];
			}
			System.out.println(a[i]);
		}
		System.out.println(max);
		for (int j=0; j<max; j++) {
			if (a[j]<max) {
				System.out.print(" ");
			}
			else if (a[j]==max){
				System.out.print("*");
			}
		}
		
	}

}
