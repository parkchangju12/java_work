package java문제풀이1;
import java.util.Scanner;
import java.util.Random;
public class Chapter6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int [] a = new int[num];
		for (int i =0; i<num; i++) {
			a[i] = rand.nextInt(10)+1;
			for (int j=0; j<i; j++) {
					if(a[i]==a[j]) {
						i--;
					}
				}
			}
		for (int i=0; i<num; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}

		
		
	}

}
