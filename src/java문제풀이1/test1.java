package java문제풀이;

import java.util.Random;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String result[] = new String[2];
		int number[] = new int[2];
		String result1
		for (int i =0; i < result.length; i++) {
			int num=random.nextInt();
			if (num == 0) {
				result[i] = "가위";
				number[i] = num;
			}
			else if (num==1) {
				result[i] = "바위";
				number[i] = num;
			}
			else if (num ==2) {
				result[i] = "보";
				number[i] = num;
			}
			if (num[0]-num[1]==-2) {
				System.out.println("플레이어1 승리");
			}
			else if (num[0]-num[1]) {
				System.out.println("플레이어2 승리");
		
		}

		}
		
	}

}
