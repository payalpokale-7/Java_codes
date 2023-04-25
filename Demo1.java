//Default Exception Handler
package exception;

import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		char c;
		System.out.println("Enter a character");
		c=(char)System.in.read();
		Thread.sleep(3000);
		System.out.println("Character="+c);

	}

}
