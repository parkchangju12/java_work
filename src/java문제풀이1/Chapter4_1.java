package java문제풀이;
import java.util.Scanner;
public class Chapter4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, again;
//		while (true) {
//			System.out.println("정수값을 입력 하세요:");
//			int i = sc.nextInt();
//			if (i<0) {
//				System.out.println("이 값은 음수 입니다.");
//			}
//			else if (0<i) {
//				System.out.println("이 값은 양수 입니다.");
//			}
//			else {
//				System.out.println("이 값은 0 입니다.");
//			}
//			System.out.println("다시 한번 입력하시겠습니까? (Yes: 1, No: 2)");
//			int again = sc.nextInt();
//			if (again == 1) {
//				continue;
//			}
//			else if (again == 2) {
//				break;
//				
//		
//			}
//		}

		do{
			System.out.println("정수값을 입력하세요: ");
            num = sc.nextInt();
            if (num<0) System.out.println("음수 입니다.");
            else if (num>0) System.out.println("양수 입니다.");
            else System.out.println("0 입니다.");
            System.out.println("다시 한번 입력하시겠습니까?  (Yes: 1, No: 2)");
            again = sc.nextInt();
  
        }while(again != 2);

        System.out.println("끝");
	}

}
