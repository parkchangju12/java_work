package java문제풀이1;
import java.util.Scanner;
public class Chapter6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수: ");
		int num = sc.nextInt();
		double [] a = new double[num];
		double total = 0;
		for (int i=0; i<num; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			total +=a[i];
		}
		System.out.println("합: "+ total);
		System.out.println("평균: "+total/num);
		sc.close();
	}

}
