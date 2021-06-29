package java문제풀이1;

import java.util.Scanner;

public class Chapter7_17 {

	static void linearSearch(int[] a, int find) {
		int cnt = 0;
//		요소의 수를 체크 해주는 for 문
		for (int i=0; i<a.length; i++) {
			if (a[i] == find) {
				cnt+=1;
			}
		}
//		가장 앞자리 위치 값을 찾아주는 for 문
		for (int i=0; i<a.length; i++) {
			if (a[i] == find) {
				if (cnt>1) {
					System.out.println("해당 값의 요소가 여러개 존재합니다.");
				}
				System.out.println("가장 앞에 위치한 값은 x["+i+"]에 있습니다.");
				break;
			}
		}
	}
	
	static void linearSearchR(int[] a, int find) {
//		가장 뒤자리 위치 값을 찾아주는 for 문
		for (int i=a.length-1; i>=0; i--) {
			if (a[i] == find) {
				System.out.println("가장 뒤에 위치한 값은 x["+i+"]에 있습니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요소수: ");
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("a["+i+"]: ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("찾는 값: ");
		int find = sc.nextInt();
		
		linearSearch(a,find);
		linearSearchR(a,find);
		
		sc.close();
	}

}
