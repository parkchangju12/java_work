package java����Ǯ��1;

class Human1 {
	
	String name;
	int height, weight;
	
	public void huMan(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	public void Print() {
		System.out.println("�̸�: "+name);
		System.out.println("����: "+height+"cm");
		System.out.println("ü��: "+weight+"kg");
	}
	
	
}


public class Chapter8_1e {
	
	public static void main(String[] args) {
		Human1 human = new Human1();
		human.huMan("�浿", 170, 60);
		human.Print();
		human.huMan("ö��", 166, 72);
		human.Print();
	}

}
