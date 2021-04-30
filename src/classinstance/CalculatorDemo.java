package classinstance;

class Calculator {
	static double PI = 3.14;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		System.out.println(Calculator.PI);
		c1.setOperands(10,300);
		c1.sum();
		c1.avg();
		c2.setOperands(7210, 454572);
		c2.sum();
		c2.avg();
	}

}
