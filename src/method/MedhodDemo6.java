package method;

public class MedhodDemo6 {
	
	public static String numbering(int num, int limit) {
		int i = num;
		String output = "";
		while (i < limit) {
			output+=i;
			output+="\n";
			i++;
		}
		return output;
		
	}
	
	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
	}

}
