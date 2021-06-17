package java문제풀이1;
import java.util.Scanner;
public class Chapter6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr;
		Scanner sc = new Scanner(System.in);
		System.out.print("행 수: ");
		int num1 = sc.nextInt();
		int num2;
		arr=new int[num1][];
		for (int i=0; i<num1; i++) {
			System.out.print(i+"행의 열수: ");
			num2 = sc.nextInt();
			arr[i] = new int[num2];
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print("arr["+i+"]"+"["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println();
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%5d",arr[i][j]);
			}
		}
	}
}
