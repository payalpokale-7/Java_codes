//Swing by inheritance 
package swing;
import javax.swing.*;
public class Swing3 extends JFrame{//Inheriting JFrame
	JFrame f;
	Swing3(){
JButton b=new JButton("click");//Create button JButton
b.setBounds(130, 100, 100, 40);

add(b);//Adding button on frame  
setSize(400,500);
setLayout(null);
setVisible(true);
	
	}
	public static void main(String[] args) {
		new Swing3();

	}

}
