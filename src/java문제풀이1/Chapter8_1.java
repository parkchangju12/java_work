package java����Ǯ��1;


class Human {
	
	private String name;
	private int height, weight;
	private boolean bolup=true;
	private boolean boldown=true;
	
	public void huMan(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void Print() {
		if (bolup==false) {
			System.out.println(name +"�� ü���� ���� �߽��ϴ�.");
			bolup = true;
		}
		else if (boldown==false) {
			System.out.println(name +"�� ü���� ���� �߽��ϴ�.");
			boldown = true;
		}
		System.out.println("�̸�: "+name);
		System.out.println("����: "+height+"cm");
		System.out.println("ü��: "+weight+"kg");
		System.out.println();
	}
	
	public void weightUp(int up) {
		this.weight += up;
		this.bolup = false;
	}
	
	public void weightdown(int down) {
		this.weight -= down;
		this.boldown = false;
	}
	
	
}


public class Chapter8_1 {
	
	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();
		
		gildong.huMan("�浿", 170, 60);
		gildong.Print();
		
		chulsu.huMan("ö��", 166, 72);
		chulsu.Print();
		gildong.weightUp(5);
		gildong.Print();
		chulsu.weightUp(5);
		chulsu.Print();
		gildong.weightdown(5);
		gildong.Print();
		chulsu.weightdown(5);
		chulsu.Print();
		
	}

}
