package java문제풀이1;
import java.util.Scanner;
public class Chapter6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = sc.nextInt();
		int [] a = new int[num];
		int cnt = 0;
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("찾는 숫자:");
		int find = sc.nextInt();
		for(int j=0; j<a.length; j++) {
			if (find==a[j]) {
				cnt = j;
			}
			
		}
		System.out.println("찾는 숫자는 a["+cnt+"]에 있습니다.");
		sc.close();
	}

}
