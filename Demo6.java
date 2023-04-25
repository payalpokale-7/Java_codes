//Block synchronization
package multithreding;
class TableDemo1
{
	void show(int x) {
		synchronized(this) {
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(1500);
				System.out.println(i*x);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
}
class One1 extends Thread
{
	TableDemo1 t;
	One1(TableDemo1 t){
		this.t=t;
	}
	@Override
	public void run() {
		t.show(10);
		super.run();
	}
}
class Two1 extends Thread{
	TableDemo1 t;
	Two1 (TableDemo1 t){
		this.t=t;
	}
	@Override
	public void run() {
		t.show(8);
		super.run();
	}
	
}
public class Demo6 {

	public static void main(String[] args) {
		TableDemo1 d=new TableDemo1();
		One1 o=new One1(d);
		o.start();
		Two1 t=new Two1(d);
		t.start();
	}
}
