package java문제풀이1;

import java.util.Scanner;
public class Chapter4_29 {

//	5개의 정수로 구성된 그룹의 전체 합계(그룹별 합계 아닌 전체 그룹의 합)를 구하는 프로그랩을 작성하시오.
//	전체 10개의 그룹이 있으며 각 정수값은 키보드로 입력한다. 이때 99999를 입력하면 전체 입력을 종료하고
//	88888을 입력하면 현재 읽고 있는 구룹의 입력을 종료하시오
//	ex
//	정수를 더합니다.
//	1그룹
//	정수:5
//	정수:3
//	정수:2
//	정수:4
//	정수:8
//	2그룹
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int total = 0;
		System.out.println("정수를 더합니다.");
		for (int i=1; i<=10; i++) {
			System.out.println(i+"그룹");
			for (int j=1; j<=5; j++) {
				System.out.print("정수: ");
				num = sc.nextInt();
				total+=num;
				if (num==99999) {
					j=6;
					total-=num;
				}
				else if(num==88888) {
					j=6;
					total-=num;
				}
			}
			if (num==99999) {
				i=11;
			}
			
		}
		System.out.println("합계는 "+total+"입니다.");
		sc.close();
		
	}
	
	

}
