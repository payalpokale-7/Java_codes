package java8;
@FunctionalInterface
interface Drawable{
	public void draw();
	
}
public class Demo1 {

	public static void main(String[] args) {
		int width=10;
		Drawable d=()->
		{
			System.out.println("drawing:"+width);
		};
		d.draw();

	}

}
