package java문제풀이1;

public class Chapter6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[5];
		
		for (int i = 0; i<a.length; i++) {
			a[i] = a.length-i;
			System.out.println("a["+i+"] = "+a[i]);
		}
	}

}
