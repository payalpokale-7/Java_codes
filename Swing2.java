//Swing by Association inside constructor
package swing;
 import javax.swing.*; 
public class Swing2 {
	JFrame f;
	Swing2(){
		f=new JFrame();//Creating instance of JFrame
		JButton b=new JButton("click");//Creating instance of JButton
		b.setBounds(130,100,100,40);
		f.add(b);//Adding button in JFrame 
		f.setSize(400,500);//400 with and 500 height 
		f.setLayout(null);//Using no layout managers 
		f.setVisible(true);//Making the frame visible 
	}

	public static void main(String[] args) {
		new Swing2();

	}

}
