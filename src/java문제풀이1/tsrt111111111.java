package java����Ǯ��1;
import java.util.Random;
import java.util.Scanner;
public class tsrt111111111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random  rand = new Random();
		Scanner sc = new Scanner(System.in);
		String [] name = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		boolean end=true;
		int [] num = new int[12];
		
		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�.");
		System.out.println("ù���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���.");

		while(end) {

			int month = rand.nextInt(12)+1;
			int save = month;
			System.out.print(month+"�� : ");
			String input = sc.next();
			
			if (name[month-1].equals(input)) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				while(name[save-1].equals(input)==false) {
					System.out.print(month+"�� : ");
					input = sc.next();
					if (name[month-1].equals(input)) {
						System.out.println("�����Դϴ�.");
						break;
					}
					else {
						System.out.println("Ʋ�Ƚ��ϴ�.");
					}
				}
			}
			
			while (end) {
				System.out.print("��� �Ͻðڽ��ϱ�? (�ٽ�:1 ��:0) : ");
				int re = sc.nextInt();
				if (re ==0) {
					end =false;
				}
				else if (re == 1) {
					break;
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
				}
			}
			
		}
				
	}

}
