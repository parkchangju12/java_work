package java문제풀이1;
import java.util.Scanner;
import java.util.Random;
public class Chapter6_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		System.out.print("요소수");
		int num = input.nextInt();
		int[] intList = new int[num];
		for(int z = 0; z<intList.length; z++) {
			intList[z] = rnd.nextInt(10)+1;
		}
		System.out.println("");
		 for(int r = 10; r>0; r--) {
             for(int i = 0; i<num; i++) {
                 if (r <= intList[i])                      System.out.print("* ");
                 if(r > intList[i])                     System.out.print("  ");
             }
		 }
		 System.out.println("");
		 for(int i = 0; i <intList.length; i++ ) {
             System.out.print("- ");
             }
		 System.out.println("");
		 for(int i = 0; i <intList.length; i++ ) {
             System.out.print(intList[i]+" ");
             }
	}

}
