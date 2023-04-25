//Map with Generic
package collection;
import java.util.*;
public class Demo16 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<Integer,String>();
		m.put(10, "Abc");
		m.put(52, "Hello");
		m.put(30, "Hii");
		m.put(14, "XYZ");
		Set<Integer>s=m.keySet();
		Iterator<Integer>i=s.iterator();
		while(i.hasNext()) {
			int k=i.next();
		    String v=m.get(k);
		    System.out.println(k+"="+v);
		}
	}

}
