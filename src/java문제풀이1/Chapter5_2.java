package java����Ǯ��1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Chapter5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> add = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"));
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.printf("8���� : %o\n",num);
		System.out.printf("16���� : %x\n",num);
		
		
		System.out.println("8���� : "+((num/8)*10+(num%8)));
		System.out.println(num%8);
		System.out.println("16���� : "+(num/16)+add.get((num%16)));
		
		
	}

}
