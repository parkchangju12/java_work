package java����Ǯ��;
import java.util.Random;
public class Chapter7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int num = random.nextInt(3);
		String result;
		if (num ==0) {
			result = "����";
		}
		else if (num ==1) {
			result = "����";
		}
		else {
			result = "��";
		}
		System.out.println(result);
//		switch(num) {
//		case 0:
//			System.out.println("����");
//			break;
//		case 1:
//			System.out.println("����");
//			break;
//		case 2:
//			System.out.println("��");
//			break;
//		}
		
	}

}
