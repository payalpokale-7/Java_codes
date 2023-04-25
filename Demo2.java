package java8;
interface Addable
{
public void add(int x,int y);
}
public class Demo2 {

	public static void main(String[] args) {
		Addable a=(x,y)->
		{
		System.out.println("Addition="+(x+y));
	};
	a.add(20,30);

}
}