//Method Synchronization
package multithreding;
class TableDemo
{
	synchronized void show(int x) {
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
class One extends Thread
{
	TableDemo t;
	One(TableDemo t){
		this.t=t;
	}
	@Override
	public void run() {
		t.show(10);
		super.run();
	}
}
class Two extends Thread{
	TableDemo t;
	Two (TableDemo t){
		this.t=t;
	}
	@Override
	public void run() {
		t.show(8);
		super.run();
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		TableDemo d=new TableDemo();
		One o=new One(d);
		o.start();
		Two t=new Two(d);
		t.start();
	}
}
