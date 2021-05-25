package java문제풀이1;


public class Chapter5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("x            x의제곱");
		System.out.println("------------------");
		System.out.println("int 반복");
		float x = 0.0F;
		for (int i=0; i<=1000; i++) {
			System.out.printf("%5.3f    %9.7f\n", x,x*x);
			x +=0.001F;
		}
		
		System.out.println("x            x의제곱");
		System.out.println("------------------");
		System.out.println("float 반복");
		System.out.println("x            x의제곱");
		System.out.println("------------------");
		for (float j=0.0f; j<=1.0f; j+=0.001f) {
			System.out.printf("%5.3f    %9.7f\n", j,j*j);
		}
		
	}

}
