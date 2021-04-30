package accessmodifier;

class calculator {
	private int left, right;
	
	void setOperands(int left, int right) {
		if (left >=0 && left <= 100 || right >=0 && right <= 100) {
			this.left = left;
			this.right = right;
		}
		else {
			System.out.println("값이 충족하지 않습니다.");
		}
	}
	
	
	
	private int _sum() {
		return this.left+this.right;
	}
	public void sumDecPlus() {
		System.out.println("++++"+_sum()+"++++");
	}
	public void sumDecoMinus() {
		System.out.println("----"+_sum()+"----");
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c1 = new calculator();
		c1.setOperands(10, 20);
		c1.sumDecPlus();
		c1.sumDecoMinus();

	}

}
