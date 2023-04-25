package multithreding;
class Buffer{
	int data;
	boolean status = false;
	synchronized void get(int data) throws InterruptedException{
		System.out.println("Document Thread Started");
		if(status==true)
		{
			System.out.println("Documents goes into waiting...");
			wait();
		}
		this.data=data;
		System.out.println("Document added..."+data);
		status=true;
		notify();
	}
	 synchronized void put() throws InterruptedException{
		System.out.println("Printer Thread started");
		if(status==false)
		{
			System.out.println("Printer goes into Waiting...");
			wait();
		}
		this.data=data;
		System.out.println("Document Printed..."+data);
		status=false;
		notify();
		
		}
	}
class Document extends Thread{
	Buffer b;
	Document(Buffer b)
	{
		this.b=b;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				b.get(i);
			}catch(Exception e) {
		}
		super.run();
	}
	
}
}
class Printer extends Thread
{
	Buffer b;
	Printer(Buffer b)
	{
		this.b=b;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				b.put();
			}catch(Exception e) {
		}
		super.run();
	}
}
}
public class Demo8 {

	public static void main(String[] args) {
		Buffer b=new Buffer();
		Document d=new Document(b);
		d.start();
		Printer p=new Printer(b);
		p.start();
	}
}
