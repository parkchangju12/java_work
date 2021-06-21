package java문제풀이1;
import java.util.Scanner;

public class Chapter6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] classnum;
		int [] total;
		int tl = 0;
		double ts = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("반의 갯수: ");
		int num = sc.nextInt();
		classnum = new int[num][];
		total = new int[num];
		for (int i=0; i < num; i++) {
			System.out.print(i+1+"반의학생수: ");
			int cs = sc.nextInt();
			ts+=cs;
			classnum[i] = new int[cs];
			for (int j=0; j<classnum[i].length; j++) {
				System.out.print(i+1+" 반"+(j+1)+"번의 점수: ");
				int score = sc.nextInt();
				classnum[i][j] = score;
			}
		}
		System.out.printf("%s%10s%10s%10s%n","반","|","합계","평균");
		System.out.printf("%34s%n","==================================");
		for (int i =0; i<classnum.length; i++) {
			for (int j=0; j<classnum[i].length; j++) {
				total[i] += classnum[i][j];
				
			}
			tl += total[i];
			System.out.printf("%s%9s%11s%11.1f%n",((i+1)+"반"),"|",total[i],(total[i]/(double)classnum[i].length));
		}
		System.out.printf("%34s%n","==================================");
		System.out.printf("%s%10s%11d%11.1f","합","|",tl,(tl/ts));
		sc.close();
	}

}
