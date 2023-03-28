import java.util.*;
public class Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("\nEnter your Age");
		age=sc.nextInt();
		if(age>18)
			System.out.println("Yay!! You are Eligible For Voting :)");
		else
			System.out.println("Sorry!! You are too young :(");
	}

}
