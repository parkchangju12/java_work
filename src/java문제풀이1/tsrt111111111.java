package java문제풀이1;
import java.util.Random;
import java.util.Scanner;
public class tsrt111111111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random  rand = new Random();
		Scanner sc = new Scanner(System.in);
		String [] name = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		boolean end=true;
		int [] num = new int[12];
		
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫글자는 대문자, 나머지는 소문자로 입력하세요.");

		while(end) {

			int month = rand.nextInt(12)+1;
			int save = month;
			System.out.print(month+"월 : ");
			String input = sc.next();
			
			if (name[month-1].equals(input)) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
				while(name[save-1].equals(input)==false) {
					System.out.print(month+"월 : ");
					input = sc.next();
					if (name[month-1].equals(input)) {
						System.out.println("정답입니다.");
						break;
					}
					else {
						System.out.println("틀렸습니다.");
					}
				}
			}
			
			while (end) {
				System.out.print("계속 하시겠습니까? (다시:1 끝:0) : ");
				int re = sc.nextInt();
				if (re ==0) {
					end =false;
				}
				else if (re == 1) {
					break;
				}
				else {
					System.out.println("다시 입력하세요");
					continue;
				}
			}
			
		}
				
	}

}
