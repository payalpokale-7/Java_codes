//Stack
package collection;
import java.util.*;
public class Demo9 {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(50);
		s.push(40);
		s.push(20);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
