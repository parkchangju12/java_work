package java문제풀이1;

import java.util.Scanner;
import java.util.Random;
public class Chapter6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] week = new String[] {"sunday","monday","tuesday","wadnesday","thursday","friday","saturday"};
		String [] weeks = new String[] {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int [] num = new int[7];
		boolean end = true;
		int start = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<week.length; i++) {
			num[i]=rand.nextInt(7);
			for (int j = 0; j<i; j++) {
				if (num[i]==num[j]) {
					i--;
				}
			}
		} //중복제거
		while(end) {
			System.out.println("해당 요일의 단어를 입력 하시오.");
			System.out.println("소문자로 입력하세요");
			System.out.print(weeks[num[start]]+":");
			String input = sc.next();
			if(week[num[start]].equals(input)) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
				while(end) {
					System.out.print(weeks[num[start]]+":");
					input = sc.next();
					if(week[num[start]].equals(input)) {
						System.out.println("정답입니다.");
						break;
					}
					else {
						System.out.println("틀렸습니다.");
					}
				}
			}//문제출제
			while(end) {
				System.out.print("계속 하시겠습니까? (다시:1 끝:0) : ");
				int re = sc.nextInt();
				if (re ==0) {
					end =false;
					System.out.println("끝!");
				}
				else if (re == 1) {
					start++;
					break;
				}
				else {
					System.out.println("다시 입력하세요");
					continue;
				}
			}//다시한번
		}
		sc.close();
		
		
		
	}

}
