package java����Ǯ��1;

import java.util.Scanner;
import java.util.Random;
public class Chapter6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] week = new String[] {"sunday","monday","tuesday","wadnesday","thursday","friday","saturday"};
		String [] weeks = new String[] {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		int [] num = new int[7];
		boolean end = true;
		int start = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<week.length; i++) {
			num[i]=rand.nextInt(7);
			for (int j = 0; j<i; j++) {
				if (num[i]==num[j]) {
					i--;
				}
			}
		} //�ߺ�����
		while(end) {
			System.out.println("�ش� ������ �ܾ �Է� �Ͻÿ�.");
			System.out.println("�ҹ��ڷ� �Է��ϼ���");
			System.out.print(weeks[num[start]]+":");
			String input = sc.next();
			if(week[num[start]].equals(input)) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				while(end) {
					System.out.print(weeks[num[start]]+":");
					input = sc.next();
					if(week[num[start]].equals(input)) {
						System.out.println("�����Դϴ�.");
						break;
					}
					else {
						System.out.println("Ʋ�Ƚ��ϴ�.");
					}
				}
			}//��������
			while(end) {
				System.out.print("��� �Ͻðڽ��ϱ�? (�ٽ�:1 ��:0) : ");
				int re = sc.nextInt();
				if (re ==0) {
					end =false;
					System.out.println("��!");
				}
				else if (re == 1) {
					start++;
					break;
				}
				else {
					System.out.println("�ٽ� �Է��ϼ���");
					continue;
				}
			}//�ٽ��ѹ�
		}
		sc.close();
		
		
		
	}

}
