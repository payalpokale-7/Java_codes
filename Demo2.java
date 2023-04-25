package multithreding;
//by implementing runnable interface
class MyThread1 implements Runnable
{

	@Override
	//Active
	public void run() {
		System.out.println("In run()");
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		Thread t1=new Thread(m1);//Born state
		t1.start();//Runnable
		//dead state
	}

}
