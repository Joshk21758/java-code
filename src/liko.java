//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class liko extends JFrame{
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextField tf1;
	private JTextField tf2;
	private JPasswordField PasswordField;

	private JButton btn;

	//create a window
	public liko(){
		super("Login");
		setLayout(new FlowLayout());

		label1 = new JLabel("Username");
		label1.setBounds(20, 20, 15, 15);
		label1.setFont(new Font("Serif", Font.ITALIC, 15));
		add(label1);

		tf1 = new JTextField(17);
		tf1.setBounds(50, 20, 17, 15);
		add(tf1);

		label2 = new JLabel("Identification No. ");
		label2.setBounds(20, 50, 15, 15);
		label2.setFont(new Font("Serif", Font.ITALIC, 15));
		add(label2);

		tf2 = new JTextField(17);
		tf1.setBounds(50, 50, 17, 15);
		add(tf2);

		label3 = new JLabel("Password");
		label3.setBounds(20, 80, 15, 15);
		label3.setFont(new Font("Serif", Font.ITALIC, 15));
		add(label3);

		PasswordField = new JPasswordField(17);
		PasswordField.setBounds(50, 80, 17, 15);
		add(PasswordField);

		btn = new JButton("Login");
		btn.setBounds(30, 120, 3, 3);
		//Add ActionListener
		btn.addActionListener(
				new ActionListener(){
					//ActionListener method
					public void actionPerformed(ActionEvent event){
						JOptionPane.showMessageDialog(null, "Login successful", "Welcome!", JOptionPane.INFORMATION_MESSAGE);

					}
				}

		);
		add(btn);

	}
}
