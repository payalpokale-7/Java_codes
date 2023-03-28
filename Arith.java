import java.util.*;
public class Arith {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x,y;
		String ch;
		System.out.println("Enter 2 integers");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Enter your choice\nAdd\nSub\nMult\nDiv\nMod");
		ch=sc.next();
		
		switch(ch)
		{
		case "Add":
			System.out.println("Add="+(x+y));
			break;
		case "Sub":
			System.out.println("Sub="+(x-y));
			break;
		case "Mult":
			System.out.println("Mult="+(x*y));
			break;
		case "Div":
			System.out.println("Div="+(x/y));
			break;
		case "Mod":
			System.out.println("Mod="+(x%y));
			break;
			default:
				System.out.println("Invalid choice");
				break;
		}

	}

}
