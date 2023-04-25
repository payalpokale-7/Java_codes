//HashMap
package collection;
import java.util.*;
public class Demo10 {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put(12, "Pune");
		m.put('A', 5.2f);
		m.put(36.21, 54);
		m.put(null, 's');
		m.put("Hii", null);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.containsKey(null));
		System.out.println(m.containsValue(58));
		System.out.println(m.get(null));
		m.remove(null);
		System.out.println(m);
		Map m1=new HashMap();
		m1.put(45, "ABC");
		m1.put('D', 57);
		m1.put(78, 45);
		System.out.println(m1);
		System.out.println(m);
		m.clear();
		System.out.println(m);
		System.out.println(m.isEmpty());

	}

}
