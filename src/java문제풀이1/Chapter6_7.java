package java문제풀이1;
import java.util.Scanner;
public class Chapter6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사람수 : ");
		int num = sc.nextInt();
		int [] a = new int[num];
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"번 점수 : ");
			a[i] = sc.nextInt();
			total +=a[i];
			if (a[i]>max) max =a[i];
			if (a[i]<min) min =a[i];
			if (i==a.length-1) {
				System.out.println("합계 : "+total);
				System.out.println("평균 : "+ (double)total/a.length);
				System.out.println("최고점 : "+max);
				System.out.println("최저점 : "+min);
			}
		}
		sc.close();
	}

}
