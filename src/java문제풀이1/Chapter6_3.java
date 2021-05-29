package java문제풀이1;

public class Chapter6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] a = new double[5];
		double result = 1.1;
		for (int i = 0; i<a.length; i++) {
			a[i] = result;
			result=a[0]+result;
			System.out.println(a[i]);
		}
	}

}
