package java문제풀이1;
import java.util.Scanner;
public class Chapter7_6 {
	
	static void printSeason(int m) {
		switch(m) {
			case 12,1,2:
				System.out.println("겨울");
				break;
			case 3,4,5:
				System.out.println("봄");
				break;
			case 6,7,8:
				System.out.println("여름");
				break;
			case 9,10,11:
				System.out.println("가을");
				break;
			default:
				System.out.println("아무것도 표시하지 않음");
				break;
		}

	}
	static void printSeason1(int m) {
		if (m>=1 && m<=2 || m==12) {
			System.out.println("겨울");
			}
		else if (2<m && m<6) {
			System.out.println("봄");
			}
		else if (5<m && m<9) {
			System.out.println("여름");
			}
		else if (8<m && m<12) {
			System.out.println("가을");
			}
		else {
			System.out.println("아무것도 표시하지 않음");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력: ");
		int num = sc.nextInt();
		printSeason(num);
		printSeason1(num);
	}

}
