package java����Ǯ��1;


class Car{
	
	String name, number;
	int width, height, length;
	double posx, posy,volume, fuel, yeonbi;
	
	public void carinfo(String name, String number, int width, int height, int length,  double volume,  double yeonbi) {
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.posx = 0;
		this.posy = 0;
		this.volume = volume;
		this.fuel = 0;
		this.yeonbi = yeonbi;
		
	}
	
	public void getX(){ //x,y ��ǥ
		System.out.println("x��ǥ: "+posx);
		
	}
	
	public void getY(){ //x,y ��ǥ
		System.out.println("y��ǥ: "+posy);
	}
	public void getFuel(){
		System.out.println("�ܿ� ����: "+fuel);
	}
	
	public void movCar(int x, int y) {
		this.posx += x;
		this.posy += y;
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("���� �Ÿ�:"+dist);
		double requireFuel = dist / yeonbi;
		System.out.println("���� �Ҹ�: "+requireFuel);
		this.fuel -= requireFuel;
		if (fuel<=0) {
			System.out.println("���ᰡ �����մϴ� ���Ḧ �־��ּ���");
			this.fuel=0;
		}
	}
	
	public void displaySpec() {
		System.out.println("�ڵ��� ���");
		System.out.println("��: "+ width);
		System.out.println("����: "+ height);
		System.out.println("����: "+ length);
	}
	
	public void reFueling(double fuel) { //����
		if (volume < fuel) {
			System.out.println("�뷮�� �ѽ��ϴ�.");
		}
		else {
			this.fuel+=fuel;
		}
	}
	
}

public class Chapter8_3 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carlans = new Car();
		carlans.carinfo("��ī����", "32��1234",1820, 1650,4545,199.8,8.6);
		Car thenew = new Car();
		thenew.carinfo("�����ھ�", "23��1234", 1800, 1570, 4180, 159.8, 6.86);
		carlans.reFueling(199.9);
		carlans.getFuel();
		
		while (carlans.fuel<20) {
			carlans.movCar(5, 5);
			carlans.getX();
			carlans.getY();
			
		}
	}

}
