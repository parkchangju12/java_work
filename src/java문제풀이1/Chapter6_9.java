package java����Ǯ��1;
import java.util.Scanner;
public class Chapter6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��� ��: ");
		int num = sc.nextInt();
		double [] a = new double[num];
		double total = 0;
		for (int i=0; i<num; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			total +=a[i];
		}
		System.out.println("��: "+ total);
		System.out.println("���: "+total/num);
		sc.close();
	}

}
