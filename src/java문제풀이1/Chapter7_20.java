package java문제풀이1;
import java.util.Scanner;
public class Chapter7_20 {

	static void exchangeArray(int [] a, int [] b) {
//		교환을 저장할 변수
		int status;
//		반복문 크기를 정해주는 변수 초기엔 a의 배열의 크기를 넣어준다.
		int num=a.length;
//		배열의 반복문은 두 배열중 크기가 작은 배열로 반복을 해주어야 작동하여 a가 b보다 클 경우엔 num에 b의 크기를 넣어준다.
		if (a.length>b.length) {
			num=b.length;
		}
//		a와 b를 교환
		for (int j=0; j<num; j++) {
			status = a[j];
			a[j] = b[j];
			b[j] = status;
		}
		
//		a와 b 배열 출력
		System.out.println("배열 a와 b의 전체 요소를 교환");
		for (int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			System.out.println(a[i]);
		}
		
		for (int i = 0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			System.out.println(b[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요소 수: ");
//		배열의 크기를 정해줌
		int n = sc.nextInt();
		int [] a = new int[n];
//		배열의 크기만큼 반복 하여 a 배열에 숫자를 넣어줌
		for (int i = 0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i] = sc.nextInt();
		}
		System.out.print("배열 b의 요소 수: ");
//		배열의 크기를 정해줌
		n = sc.nextInt();
		int [] b = new int[n];
//		배열의 크기만큼 반복 하여 b 배열에 숫자를 넣어줌
		for (int i = 0; i<b.length; i++) {
			System.out.print("b["+i+"]: ");
			b[i] = sc.nextInt();
		}
		exchangeArray(a,b);
		sc.close();
	}

}
