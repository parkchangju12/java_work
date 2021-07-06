package java문제풀이1;

class Human1 {
	
	String name;
	int height, weight;
	
	public void huMan(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	public void Print() {
		System.out.println("이름: "+name);
		System.out.println("신장: "+height+"cm");
		System.out.println("체중: "+weight+"kg");
	}
	
	
}


public class Chapter8_1e {
	
	public static void main(String[] args) {
		Human1 human = new Human1();
		human.huMan("길동", 170, 60);
		human.Print();
		human.huMan("철수", 166, 72);
		human.Print();
	}

}
