
public class NestedFor {

	public static void main(String[] args) {
		int i,j;
		
		
		System.out.println("\nPattern 1:\n");
		//outer for loop
		for(i=1;i<=5;i++)
		{
			//inner for loop
			for(j=1;j<=i;j++)
			{
				System.out.println(" * ");
			}
			System.out.println("\n");
		}
		
		System.out.println("\nPattern 2:\n");
		//outer for loop
		for(i=1;i<=6;i++)
		{
			//inner for loop
			for(j=1;j<=i;j++)
			{
				System.out.println(i);
			}
			System.out.println("\n");
		}
		
		System.out.println("\nPattern 3:\n");
		//outer for loop
		for(i=6;i<=1;i--)
		{
			//inner for loop
			for(j=6;j<=1;j--)
			{
				System.out.println(i);
			}
			System.out.println("\n");
		}
		
		

	}

}
