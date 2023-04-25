package swing;
import java.awt.*;
import javax.swing.*;

 class Login extends JFrame {
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
    Login()
    {
    	l1=new JLabel("Login ID:");
    	t1=new JTextField();
    	l2=new JLabel("Password");
    	t2=new JTextField();
    	l3=new JLabel();
        b1=new JButton("Login");
        b2=new JButton("Reset");
        l1.setBounds(10, 10, 100, 40);
        t1.setBounds(120, 10, 100, 40);
        l2.setBounds(10, 60, 100, 40);
        t2.setBounds(120, 60, 100, 40);
        b1.setBounds(40, 110, 100, 40);
        b2.setBounds(150,110,100,40);
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);add(b2);
        add(l3);
        getContentPane().setBackground(Color.gray);
        setSize(300,300);
        setVisible(true);
        setLayout(null);
    }
}
public class Swing6{
	public static void main(String[] args) {
		new Login();

	}

}
