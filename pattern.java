import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,row;
		System.out.println("\n Enter no of rows: ");
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		for(i=1;i<=row;i++)
		{ 
			for(j=1;j<row;j++)
			{
				System.out.println(" ");
			}
			for(k=1;k<=(2*i-1);k++)
			{
				System.out.println(" * ");
			}
			//System.out.println("\n");
		}
		}
		
	

}
