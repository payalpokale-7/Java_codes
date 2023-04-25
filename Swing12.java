package swing;
import java.awt.*;
import javax.swing.*;

 class Calculator extends JFrame {
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6;
	Calculator()
    {
    	l1=new JLabel("First No:");
    	t1=new JTextField();
    	l2=new JLabel("Second No:");
    	t2=new JTextField();
    	JButton b1=new JButton("+");
		JButton b2=new JButton("-");
		JButton b3=new JButton("*");
		JButton b4=new JButton("/");
    	l3=new JLabel("Result:");
    	t3=new JTextField();
    	l4=new JLabel();
        b5=new JButton("Reset");
	    b6=new JButton("Cancel");
      
        l1.setBounds(10, 10, 100, 40);
        t1.setBounds(120, 10, 100, 40);
        l2.setBounds(10, 60, 100, 40);
        t2.setBounds(120, 60, 100, 40);
        b1.setBounds(10, 110, 50, 40);
        b2.setBounds(70, 110, 50, 40);
        b3.setBounds(130, 110, 50, 40);
        b4.setBounds(190, 110, 50, 40);
        l3.setBounds(10, 160, 100, 40);
        t3.setBounds(120, 160, 100, 40);
        b5.setBounds(10, 210, 100, 40);
        b6.setBounds(120, 210,100, 40);
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(b3);add(b4);
        add(l3);add(t3);
        add(b5);add(b6);
        add(l4);
        
        getContentPane().setBackground(Color.gray);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
    }
}
public class Swing12{
	public static void main(String[] args) {
		new Calculator();

	}

}

