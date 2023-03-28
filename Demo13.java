class Vish{
	void add(int...x)
	{
		int sum=0;
		for(int i: x) {
			
			{
				sum=sum+i;
			}
			System.out.println("Sum of int=" + sum);
			}
	}
		void add1(float...f)
		{
			float sum=0;
			for(float i:f)
			{
				sum=sum+i;
			}
			System.out.println("Sum of float=" +sum);
		}
	}

public class Demo13 {

	public static void main(String[] args) {
		Vish d1=new Vish();
		d1.add(1,2,3,4,5);
		d1.add1(1,1.2f,2.5f);

	}

}
