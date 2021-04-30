package overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo {
	void A(String arg1, String arg2) {
		System.out.println("sub class: void A (String A , Stirng B)");
	}
	void A() {
		System.out.println("sub class : void A()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo2 od = new OverloadingDemo2();
		od.A();
		od.A(1);
		od.A("everybody");
		od.A("coding","everybody");

	}

}
