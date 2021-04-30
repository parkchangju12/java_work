package method;

public class MethodDemo5 {
	
	public static void numbering(int limit, int num) {
		int i = num;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbering(100,1);

	}

}
