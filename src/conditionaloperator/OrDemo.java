package conditionaloperator;

public class OrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (true || true) {
			System.out.println(1);
		}
		if (false || true) {
			System.out.println(2);
		}
		if (true || false) {
			System.out.println(3);
		}
		if (false || false) {
			System.out.println(4);
		}

	}

}
