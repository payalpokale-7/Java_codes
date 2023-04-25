//List with Generic
package collection;
import java.util.*;
public class Demo14 {

	public static void main(String[] args) {
		List <String> l=new ArrayList<String>();
		l.add("Pune");
		l.add("Mumbai");
		l.add("Goa");
		l.add("ABC");
		l.add("XYZ");
		ListIterator<String>li=l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("******************");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
