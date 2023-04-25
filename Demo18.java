//Comparator
package collection;
import java.util.*;
class Student1
{
	String name;
	int res;
	public Student1(String name, int res) {
		super();
		this.name = name;
		this.res = res;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", res=" + res + "]";
	}
}
public class Demo18 implements Comparator <Student1>{

	public static void main(String[] args) {
		Demo18 d=new Demo18();
		List <Student1>l=new ArrayList<Student1>();
		l.add(new Student1("Ram",98));
		l.add(new Student1("Rama",78));
		l.add(new Student1("Ramesh",87));
		l.add(new Student1("tina",90));
		l.add(new Student1("lina",89));
		Collections.sort(l,d);
		ListIterator<Student1>li=l.listIterator();
		while(li.hasNext()) {
			Student1 s=li.next();
			System.out.println(s);
		}

	}

	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		return s1.res-s2.res;
	}
}

