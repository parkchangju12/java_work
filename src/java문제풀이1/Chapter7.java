package java문제풀이;
import java.util.Random;
public class Chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(3);
		String result;
		if (num ==0) {
			result = "가위";
		}
		else if (num ==1) {
			result = "바위";
		}
		else {
			result = "보";
		}
		System.out.println(result);
//		switch(num) {
//		case 0:
//			System.out.println("가위");
//			break;
//		case 1:
//			System.out.println("바위");
//			break;
//		case 2:
//			System.out.println("보");
//			break;
//		}
		
	}

}
