package reflection;
import java.lang.reflect.*;
class RDemo
{
	public int x;
	final int y=20;
	public RDemo() {
		
	}
	public RDemo(int x) {
		
	}
	public void show() {
		
	}
	public void display(int e)
	{
		System.out.println("In display()"+e);
	}
}
public class Demo1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	RDemo r=new RDemo();
	Class c=r.getClass();
	System.out.println(c.getName());
	Method m[]=c.getMethods();
	for(Method i:m) {
		System.out.println(i);
	}
	Constructor con[]=c.getConstructors();
	for(Constructor i:con)
	{
		System.out.println(i);
	}
	Method m1=c.getDeclaredMethod("display", int.class);
	m1.invoke(r, 25);

	}

}
