package exception;

import java.io.IOException;
class E {
	void throwArithmeticException() {
		throw new ArithmeticException();
	}
	
	void thoewIOException() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	void throwIOException2() throws IOException{
		throw new IOException();
	}

}
