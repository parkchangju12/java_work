package java문제풀이1;

import java.util.Scanner;
public class Chapter4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h_min, h_max,up;
		do {
			System.out.print("최소 신장 값을 입력 하세요 : ");
			h_min = sc.nextInt();
			System.out.print("최대 신장 값을 입력 하세요 : ");
			h_max = sc.nextInt();
			System.out.print("증가값 : ");
			up = sc.nextInt();
			if (h_min>h_max || up<=0) System.out.println("다시입력하세요");
			else System.out.println("통과");
		}while(h_min > h_max || up <= 0);
		
		System.out.println("신장 | 표준체중");
		System.out.println("----------");
		
		for (; h_min <= h_max;) {
			double avg = (h_min -100)* 0.9;
			System.out.println(h_min+" | "+avg);
			h_min +=up;
		}
		
	}

}
