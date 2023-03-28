class Dob
{
	int date1,m,y;

	public Dob(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DateofBirth [date1=" + date1 + ", m=" + m + ", y=" + y + ", d=" + d + "]";
	}
	class Employee
	{
		int id;
		String nm;
		//@Override
		//public String toString() {
			//return "Employee [id=" + id + ", nm=" + nm + "]";
		//}
		
	}
	//Association
	Dob d;
	
}
public class Demo9 {

	public static void main(String[] args) {
		Dob d1=new Dob(24,3,2023);
		//Employee e1=new Employee(101,"Rajesh",d1);
		//System.out.println(e1);

	}

}
