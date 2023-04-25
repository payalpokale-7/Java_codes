package swing;
import javax.swing.*;
public class Swing7 {

	public static void main(String[] args) {
		JFrame f=new JFrame("RadioButton");
		ButtonGroup bg=new ButtonGroup();
		JLabel l1=new JLabel("Gender");
		JRadioButton rb1=new JRadioButton("Male");
		JRadioButton rb2=new JRadioButton("Female");
		l1.setBounds(10, 30, 100, 40);
		rb1.setBounds(80, 30, 60, 40);
		rb2.setBounds(150, 30, 100, 40);
		bg.add(rb1);
		bg.add(rb2);
		f.add(l1);f.add(rb1);f.add(rb2);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
