package java문제풀이1;


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
			System.out.println(name +"의 체중이 증가 했습니다.");
			bolup = true;
		}
		else if (boldown==false) {
			System.out.println(name +"의 체중이 감소 했습니다.");
			boldown = true;
		}
		System.out.println("이름: "+name);
		System.out.println("신장: "+height+"cm");
		System.out.println("체중: "+weight+"kg");
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
		
		gildong.huMan("길동", 170, 60);
		gildong.Print();
		
		chulsu.huMan("철수", 166, 72);
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
