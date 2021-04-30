package classinstance;

class Calculator3 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3.sum(5000, 742);
		Calculator3.avg(5000, 742);
		Calculator3.sum(5432, 1124);
		Calculator3.avg(5432, 1124);

	}

}
