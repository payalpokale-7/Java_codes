package collection;
import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add('S');
		s.add('N');
		s.add('P');
		s.add('A');
		s.add('Q');
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());

	}

}
