//LinkedList
package collection;
import java.util.*;
public class Demo7 {

	public static void main(String[] args) {
		List l=new LinkedList();
		l.add(52);
		l.add("Pune");
		l.add(5.3f);
		l.add('A');
		l.add(52);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		Object o[]=l.toArray();
		for(Object i:o) {
			System.out.println(i);
		}
		System.out.println(l.get(2));
		System.out.println(l.lastIndexOf(52));
		List l1=l.subList(1, 4);
		System.out.println(l1);
		l.remove(null);
		System.out.println(l);
		l.clear();
		System.out.println(l);
		System.out.println(l.isEmpty());

	}

}

