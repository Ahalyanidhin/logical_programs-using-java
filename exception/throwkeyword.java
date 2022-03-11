package exception;

import java.io.IOException;

public class throwkeyword {
	public static void findfile() throws IOException,ArithmeticException{
		throw new IOException("File not found");
		
	}
	
	public static void main(String args[]) {
		try {
			findfile();
			System.out.println("Rest of code in try block");
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
