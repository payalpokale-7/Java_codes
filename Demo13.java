//set with Generic
package collection;
import java.util.*;
public class Demo13 {

	public static void main(String[] args) {
		Set <Float>s=new HashSet<Float>();
		s.add(52.1f);
		s.add(3.6f);
		s.add(3.2f);
		s.add(5.6f);
		s.add(8.9f);
		System.out.println(s);
		Iterator <Float>i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
