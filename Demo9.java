package multithreding;


class MyThreadss1 extends Thread{

	@Override
	public void run() {
		
		System.out.println("In run()"+Thread.currentThread()+" "+getName());
		super.run();
	}	
}
public class Demo9 {

	public static void main(String[] args) {
		MyThreadss1 m1=new MyThreadss1();
		MyThreadss1 m2=new MyThreadss1();
		MyThreadss1 m3=new MyThreadss1();
		ThreadGroup tg=new ThreadGroup("Parent");
		Thread t1=new Thread(tg,m1,"One");
		Thread t2=new Thread(tg,m2,"Two");
		Thread t3=new Thread(tg,m2,"Three");
		t1.start();
		t2.start();
		t3.start();
		tg.list();
	}
}
