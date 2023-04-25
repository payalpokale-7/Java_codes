package multithreding;
import java.util.*;
class BankAppDemo extends Thread
{
	static int bal;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Balance");
		bal=sc.nextInt();
	}
	synchronized static void withdraw(int amt)
	{
		System.out.println(Thread.currentThread()+" is accessing");
		if(bal<amt)
		{
			System.out.println("Insufficient balance in account");
		}
		else
		{
			bal=bal-amt;
			if(bal<5000)
			{
				System.out.println("Minimum balance in Account must"+" be Rs.5000"+Thread.currentThread());
			}
			else {
				
				System.out.println("Transaction successfull by "+Thread.currentThread()+" Balance is "+bal);
			}
		}
		}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2500);
				withdraw(2500);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		super.run();
	}
	
}
public class Demo7 {

	public static void main(String[] args) {
		BankAppDemo b1=new BankAppDemo();
		b1.setName("Ram");
		b1.get();
		b1.start();
		BankAppDemo b2=new BankAppDemo();
		b2.setName("Shyam");
		b2.get();
		b2.start();
	}
}
