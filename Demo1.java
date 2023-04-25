package wrapperandstring;

public class Demo1 {

	public static void main(String[] args) {
		int x=52;
		//Autoboxing
		Integer i1=new Integer(23);
		Integer i2=new Integer(x);
		System.out.println(i1+" "+i2);
		//using method
		Integer i3=Integer.valueOf(78);
		Double d1=Double.valueOf(52.31);
		System.out.println(i3);
		System.out.println(d1);
		//Unboxing
		int x1=i1.intValue();
		int x2=i3.intValue();
		double d=d1.doubleValue();
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(d);
		
		//String into Wrapper class object
		Integer i4=new Integer("10");
		Double d2=new Double("56.67");
		Float f1=new Float("5.2f");
		System.out.println(i4);
		System.out.println(d2);
		System.out.println(f1);
		
		//String into primitive datatype
		int a2=Integer.parseInt("12");
		float f2=Float.parseFloat("2.3");
		System.out.println("Sum="+(a2+a2));
		
		//Wrapper class object into String
		String s1=i4.toString();
		String s2=d2.toString();
		System.out.println(s1);
		System.out.println(s2);
		
		//primitive datatype into String
		String s3=Integer.toString(10);
		System.out.println("Sum="+(s3+s3));
	
	}

}
