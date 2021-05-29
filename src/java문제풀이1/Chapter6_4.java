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
			if (i==a.length-1) {
				for (int b=0; b<max; b++) {
					for(int j=0; j<a.length; j++) {
						if (a[j]<max) {
							System.out.print(" "+" ");
							a[j]+=1;
						}
						else if (a[j]>=max) {
							System.out.print("*"+" ");
						}
						if (j==a.length-1) {
							System.out.println();
						}
						
					}
					if(b==max-1) {
						System.out.print("------------");
						System.out.println();
						for(int q=0; q<a.length; q++) {
							System.out.print(q+" ");
						}
					}
					
				}
			}
		}

		sc.close();
		
	}

}
