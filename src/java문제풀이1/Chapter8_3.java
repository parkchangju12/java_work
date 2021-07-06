package java문제풀이1;


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
	
	public void getX(){ //x,y 좌표
		System.out.println("x좌표: "+posx);
		
	}
	
	public void getY(){ //x,y 좌표
		System.out.println("y좌표: "+posy);
	}
	public void getFuel(){
		System.out.println("잔여 연료: "+fuel);
	}
	
	public void movCar(int x, int y) {
		this.posx += x;
		this.posy += y;
		double dist = Math.sqrt(x*x + y*y);
		System.out.println("주행 거리:"+dist);
		double requireFuel = dist / yeonbi;
		System.out.println("연료 소모: "+requireFuel);
		this.fuel -= requireFuel;
		if (fuel<=0) {
			System.out.println("연료가 부족합니다 연료를 넣어주세요");
			this.fuel=0;
		}
	}
	
	public void displaySpec() {
		System.out.println("자동차 사양");
		System.out.println("폭: "+ width);
		System.out.println("높이: "+ height);
		System.out.println("길이: "+ length);
	}
	
	public void reFueling(double fuel) { //급유
		if (volume < fuel) {
			System.out.println("용량을 넘습니다.");
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
		carlans.carinfo("뉴카렌스", "32더1234",1820, 1650,4545,199.8,8.6);
		Car thenew = new Car();
		thenew.carinfo("더뉴코아", "23나1234", 1800, 1570, 4180, 159.8, 6.86);
		carlans.reFueling(199.9);
		carlans.getFuel();
		
		while (carlans.fuel<20) {
			carlans.movCar(5, 5);
			carlans.getX();
			carlans.getY();
			
		}
	}

}
