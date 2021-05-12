package java문제풀이1;

import java.util.Scanner;
public class Chapter4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i; 
		int choice = 1;
		do {
			System.out.print("달월을 입력하세요 : ");
			i = sc.nextInt();
			if (1<=i && i<=12) {
				if (i==1 || i==2 || i==12) System.out.println("겨울 입니다.");
				else if (3<=i && i<=5) System.out.println("봄 입니다.");
				else if (6 <=i && i<=8) System.out.println("여름 입니다.");
				else if (9<=i && i<=11) System.out.println("가을 입니다.");
				do {
					System.out.print("다시 하시겠습니까? (yes:1, no:0)");
					choice = sc.nextInt();
					if (choice !=1 && choice !=0) {
						System.out.println("다시입력하세요");
					}
				}while(choice!=1 && choice!=0);
			}
			else System.out.println("다시입력하세요");
				
		}while(choice!=0);
		sc.close();
	}

}
