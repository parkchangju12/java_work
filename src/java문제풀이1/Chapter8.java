package java문제풀이;

import java.util.Scanner;
public class Chapter8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		switch(month) {
		case 12,1,2:
			System.out.println("겨울입니다.");
			break;
		case 3,4,5:
			System.out.println("봄 입니다.");
			break;
		case 6,7,8:
			System.out.println("여름 입니다.");
			break;
		case 9,10,11:
			System.out.println("가을 입니다.");
			break;
		default:
			System.out.println("잘못입력 하였습니다.");
		sc.close();
		}

	}

}
