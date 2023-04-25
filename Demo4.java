package multithreding;
//sleep() and join()
class MyThread2 extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<=4;i++)
		{
			try {
				Thread.sleep(2500);
				System.out.println("In run()"+Thread.currentThread()+" "+i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
	
}

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		MyThread2 m1 =new MyThread2();
		m1.setName("First ");
		MyThread2 m2 =new MyThread2();
		m2.setName("Second");
		MyThread2 m3 =new MyThread2();
		m3.setName("Third ");
		m1.start();
		m1.join();
		m2.start();
		m2.join();
		m3.start();

	}

}
