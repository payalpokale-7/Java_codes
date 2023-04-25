package wrapperandstring;

public class Demo3 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Profound");
		System.out.println(sb.append("Edutech"));
		System.out.println(sb.insert(0, "IT"));
		System.out.println(sb.delete(2, 10));
		System.out.println(sb.replace(0, 2, "Profound"));
		System.out.println(sb.reverse());

	}

}
