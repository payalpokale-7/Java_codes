package swing;
import javax.swing.*;
public class Swing8 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		JCheckBox c1=new JCheckBox("English");
		JCheckBox c2=new JCheckBox("Hindi");
		JCheckBox c3=new JCheckBox("Marathi");
		c1.setBounds(10,10,100,30);
		c2.setBounds(120,10,100,30);
		c3.setBounds(230,10,100,30);
		f.add(c1);f.add(c2);f.add(c3);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);

	}

}
