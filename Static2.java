class SDemo1
{
	SDemo1()
	{
		System.out.println("In Defualt cons");
	}
	{
		System.out.println("In non-static block");
	}
	static
	{
		System.out.println("In static block");
	}
}
public class Static2 {

	public static void main(String[] args) {
		SDemo1 s1=new SDemo1();
		SDemo1 s2=new SDemo1();

	}

}
