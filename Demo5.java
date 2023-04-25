package collection;
import java.util.*;
public class Demo5 {

	public static void main(String[] args) {
		NavigableSet s1=new TreeSet();
		s1.add(45);
		s1.add(65);
		s1.add(48);
		s1.add(50);
		s1.add(98);
		s1.add(10);
		System.out.println(s1);
		System.out.println(s1.floor(49));
		System.out.println(s1.ceiling(49));

	}

}
