package swing;
import javax.swing.*;

public class Swing1 {

	public static void main(String[] args) {
		JFrame f=new JFrame();//creating instance of JFrame
		JButton b=new JButton("click");//creating instance of JButton
		
		b.setBounds(190,100,100,50);//x axis ,y axis,width,height
		f.add(b);//adding button in JFrame
		f.setSize(500, 600);//500 width and 600 height
		f.setLayout(null); //using no layout managers
		f.setVisible(true);//making the frame visible
	}
}
