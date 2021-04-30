package method;

import java.io.*;

public class MethodDemo7 {
	public static String numbering(int num, int limit) {
		int i = num;
		String output = "";
		while (i <limit) {
			output +=i;
			output += "\n";
			i++;
			
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);
		System.out.println(result);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
			
		}

	}

}
