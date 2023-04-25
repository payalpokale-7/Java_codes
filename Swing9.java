package swing;
import java.awt.*;
import javax.swing.*;
public class Swing9 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.add(b5);
		f.add(b1);f.add(b4);
		f.add(b3);f.add(b2);
		f.setSize(700,700);
		f.setVisible(true);

	}

}
