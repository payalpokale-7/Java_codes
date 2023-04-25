//Custom Exception
package exception;

import java.util.*;

class Passout extends Exception {
	Passout(String msg) {
		super(msg);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passout year");
		int year = sc.nextInt();
		try {
			if (year != 2022)
				throw new Passout("Passout year must be 2022" + " Sorry u can't apply");
			else
				System.out.println("Register here");
		} catch (Passout p) {
			System.out.println(p);
		}

	}

}
