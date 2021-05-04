package polymorphism;

class O {
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
		
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		O.a(1);
		O.a("one");
		
		

	}

}
