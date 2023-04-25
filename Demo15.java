//class with Generic
package collection;
import java.util.*;
class Book{
	int bid;
	String bname,bauthor;
	float bprice;
	public Book(int bid, String bname, String bauthor, float bprice) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauthor = bauthor;
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bprice=" + bprice + "]";
	}
	
	
}
public class Demo15 {

	public static void main(String[] args) {
		List <Book>l=new ArrayList <Book>();
		l.add(new Book (101,"C","Dennis",856.9f));
		l.add(new Book (102,"Cpp","Bjarne",1650.7f));
		l.add(new Book (103,"Java","James",1860.7f));
		ListIterator <Book> li=l.listIterator();
		while(li.hasNext()) {
			Book b=li.next();
			System.out.println(b);
		}

	}

}
