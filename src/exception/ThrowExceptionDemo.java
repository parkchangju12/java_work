package exception;

import java.io.*;

class B {
	void run() {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			input = bReader.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		
	}
}

class C {
	void run() throws FileNotFoundException {
		B b = new B();
		b.run();
		b.run();
	}
}
public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
