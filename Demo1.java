package multithreding;
//by extending thread class
class MyThread extends Thread
{

	@Override
	public void run() {
		System.out.println("In run()");
		super.run();
	}
   
}
public class Demo1 {

	public static void main(String[] args) {
		MyThread m1=new MyThread();//born state
		m1.start();//Runnable state 
		//Dead state

	}

}
