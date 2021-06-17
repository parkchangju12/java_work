package java문제풀이1;
import java.util.Scanner;
public class Chapter6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] st = new int[6][2];
		float mathav = 0;
		float korav = 0;
		float [] total = new float[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("6명의 국어, 수학 점수를 입력");
		for (int i=0; i<st.length; i++) {
			System.out.print(i+1+"번");
			for (int j=0; j<st[0].length; j++) {
				if (0<=j || j<=1) {
					if (j==0) {
						System.out.printf("%6s","국어: ");
						st[i][j]=sc.nextInt();
						korav+=st[i][j];
					}
					if (j==1) {
						System.out.printf("%8s","수학: ");
						st[i][j]=sc.nextInt();
						mathav+=st[i][j];
					}
				}
				total[i] += st[i][j];
				
			}
		}
		System.out.printf("%4s","NO.");
		System.out.printf("%3s","국어");
		System.out.printf("%4s","수학");
		System.out.printf("%4s","평균");
		System.out.println();
		for (int i=0; i<st.length; i++) {
			System.out.printf("%3d",i+1);
			for (int j=0; j<st[0].length; j++) {
				if (j==0 || j==1) {
					System.out.printf("%5d",st[i][j]);
				}
				if (j==1) {
					System.out.printf("%5.1f",total[i]/2);
					System.out.println();
				}
			}
		}
		System.out.printf("%3"+ "s","평균");
		System.out.printf("%5.1f", korav/st.length);
		System.out.printf("%5.1f", mathav/st.length);
	}

}
