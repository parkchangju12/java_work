package java����Ǯ��1;
import java.util.Scanner;
import java.util.Random;
public class Chapter7_10 {
	static int[] randnum() {
		Random rand = new Random();
		int random1 = rand.nextInt(900)+100;
		int random2 = rand.nextInt(900)+100;
		int random3 = rand.nextInt(900)+100;
		int random4 = rand.nextInt(4);
		return new int[] {random1, random2, random3, random4};
	}
	static int confirmRetry() {
		Scanner sc = new Scanner(System.in);
		int fin=2;
		while (fin!=1 && fin !=0) {
			System.out.println("�ٽ��ѹ�?<yes:1, no:0>: ");
			fin = sc.nextInt();
			if (fin!=0 && fin!=1) {
				System.out.println("�ٽ��Է��ϼ���");
			}
		}
		return fin;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y, z,a, fin;
		
		int [] example = new int[4];
		String [] result = new String[4];
		
		do {
			int rand[] = randnum();
			x = rand[0];
			y = rand[1];
			z = rand[2];
			a = rand[3];
			example[0] = x+y+z;
			example[1] = x+y-z;
			example[2] = x-y+z;
			example[3] = x-y-z;
			String.valueOf(x);
			String.valueOf(y);
			String.valueOf(z);
			result[0] = x+"+"+y+"+"+z+"= ";
			result[1] = x+"+"+y+"-"+z+"= ";
			result[2] = x+"-"+y+"+"+z+"= ";
			result[3] = x+"-"+y+"-"+z+"= ";

			System.out.println("�ϻ� �Ʒ�!");
			System.out.print(result[a]);
			int scan = sc.nextInt();
			if (scan==example[a]) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				while (scan!=example[a]) {
					System.out.print(result[a]);
					scan = sc.nextInt();
				}
				System.out.println("�����Դϴ�.");
			}
			fin=confirmRetry();
		}while(fin != 0);
		System.out.println("��");
		sc.close();
	}

}
