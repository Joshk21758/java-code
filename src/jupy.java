//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class jupy extends JFrame{
	private JLabel label;
	private JTextField tf;
	private JLabel lbl;
	private JTextField tf1;

	//create a window
	public jupy(){
		super("Login");
		setLayout(new FlowLayout());

		label = new JLabel("Username");
		label.setBounds(20, 30, 6, 4);
		add(label);

		tf = new JTextField(20);
		tf.setBounds(45, 30, 20, 20);
		tf.setToolTipText("Enter your username");
		add(tf);

		lbl = new JLabel("Password");
		lbl.setBounds(20, 50, 6, 4);
		add(lbl);

		tf1 = new JTextField(20);
		tf1.setBounds(45, 50, 20, 20);
		add(tf1);


	}
}
