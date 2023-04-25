package multithreding;
class MyThreads extends Thread{

	@Override
	public void run() {
		
		super.run();
		System.out.println("In run()"+" "+Thread.currentThread()+" "+getName()+" "+"has"+" "+getPriority()+" "+"Priority");
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		MyThreads m1=new MyThreads();
		m1.setName("one");
		m1.setPriority(Thread.MAX_PRIORITY);
		MyThreads m2=new MyThreads();
		m2.setName("Two");
		m2.setPriority(Thread.MIN_PRIORITY);
		MyThreads m3=new MyThreads();
		m3.setName("Third");
		m3.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		System.out.println(m1.isAlive());
		m2.start();
		m3.start();

	}

}
