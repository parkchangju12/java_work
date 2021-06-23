package java문제풀이1;
import java.util.Random;
import java.util.Scanner;
public class ASDASDAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
//		System.out.println(num%10);
//		System.out.println(num/10);
		int result=0;
		System.out.println(num%10);
		for (int i=num; i>=0; i/=10) {
			result = result*10+num%10;
		}
		
//        while(num!=0){
//            result= result * 10 + num % 10;
//            num /= 10;
//        }
        System.out.println(result);
	}

}
