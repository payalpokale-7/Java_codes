package swing;
import java.awt.event.*;
import javax.swing.*;
class ColorChooser extends JFrame implements ActionListener{
	JLabel l1;
	JColorChooser cc;
	JButton b;
	ColorChooser(){
		l1=new JLabel();
		cc=new JColorChooser();
		b=new JButton("Change Color");
		cc.setBounds(10, 10, 300, 300);
		b.setBounds(20,330,200,40);
		add(cc);add(b);add(l1);
		b.addActionListener(this);
		setSize(600,600);
		setVisible(true);
		setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		getContentPane().setBackground(cc.getColor());
	}	
}
public class Swing11 {

	public static void main(String[] args) {
		new ColorChooser();

	}

}
