//Demo for LinkedHashset
package collection;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(30);
		s.add(null);
		System.out.println(s);

	}

}
