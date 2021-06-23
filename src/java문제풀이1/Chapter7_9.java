package java문제풀이1;
import java.util.Scanner;
public class Chapter7_9 {
	static void readPlusInt() {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수값: ");
		int num=sc.nextInt();
		
		if (num>0) {
			while(num!=0) {
				result = result*10 + num%10;
				num/=10;
			}
			System.out.println("반대로 반환:"+result);
		}
		else {
			System.out.println("다시입력해주세요");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=1;
		do {
			if(x==1) {
				readPlusInt();
			}
			System.out.print("다시한번?: (1:YES 2:NO): ");
			x = sc.nextInt();
		}while(x!=2);
		
		sc.close();
		
	}

}
