//Demo for Hashset
package collection;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add("Hello");
		s.add(2.3f);
		s.add('A');
		s.add(null);
		s.add(52.32);
		System.out.println(s);
		System.out.println("Size="+s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(50));
		System.out.println(s);
		Object O[]=s.toArray();
		for(Object i:O)
		{
			System.out.println(i);
		}
		s.remove(null);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());

	}

}
