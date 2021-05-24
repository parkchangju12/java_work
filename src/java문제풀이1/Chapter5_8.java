package java문제풀이1;


public class Chapter5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("float            int");
		System.out.println("---------------------");
		
		float x = 0.0F;
		for (int i=0; i<=1000; i++) {
			System.out.printf("%9.7f    %9.7f\n", x,(float)i/1000);
			x +=0.001F;
		}

	}

}
