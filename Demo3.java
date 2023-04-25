//Custom Exception
package exception;

import java.util.*;

class Balance extends Exception {
	Balance(String msg) {
		super(msg);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Amount");
		int Amount = sc.nextInt();
		try {
			if (Amount<5000)
				throw new Balance("You can't withdraw Amount Sorry!!");
			else
				System.out.println("Withdraw Successfully!!:)");
		} catch (Balance b) {
			System.out.println(b);
		}

	}

}
