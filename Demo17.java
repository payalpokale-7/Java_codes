//Comparable
package collection;
import java.util.*;
class Student implements Comparable<Student>
{
	String name;
	int res;
	public Student(String name, int res) {
		super();
		this.name = name;
		this.res = res;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", res=" + res + "]";
	}
	@Override
	public int compareTo(Student s1) {
		
		//return this.res-s1.res;
		return s1.res-this.res;
	}
	
}
public class Demo17 {

	public static void main(String[] args) {
	List<Student>l=new ArrayList<Student>();
	l.add(new Student("Ram",98));
	l.add(new Student("Rama",78));
	l.add(new Student("Ramesh",87));
	l.add(new Student("tina",90));
	l.add(new Student("lina",89));
	Collections.sort(l);
	ListIterator<Student>li=l.listIterator();
	while(li.hasNext()) {
		Student s=li.next();
		System.out.println(s);
	}
	}

}
