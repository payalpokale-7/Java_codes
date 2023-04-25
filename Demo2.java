package wrapperandstring;

public class Demo2 {

	public static void main(String[] args) {
		String s1=new String("Profound");
		String s2=new String("Edutech");
		System.out.println("length="+s1.length());
		System.out.println("Substring="+s1.substring(3));
		System.out.println("Substring="+s1.substring(0,3));
		System.out.println("Comparision="+(s1.equals(s2)));
		System.out.println("Concat="+s1.concat("Pune"));
		System.out.println("char="+s1.charAt(3));
		String s3=new String("welcome to Profound Edutech");
		System.out.println(s3);
		String s[]=s3.split(" ");
		for(String i:s)
		{
			System.out.println(i);
		}

	}

}
