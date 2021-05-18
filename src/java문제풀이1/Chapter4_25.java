package java문제풀이1;

import java.util.Scanner;
public class Chapter4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int cnt=0;
		do {
			System.out.print("입력 : ");
			a = sc.nextInt();
			for (int i = 1; i<=a; i++) {
				if (a % i == 0) {
					cnt+=1;
				}
			}
			if (cnt==2) {
				System.out.println(a+" 는 소수 입니다.");
			}
			else {
				System.out.println(a+" 는 소수가 아닙니다.");
			}
		}while(cnt!=2);
		sc.close();
		System.out.println("끝");
	}

}
