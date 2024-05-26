//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class mity extends JFrame{
	private JPanel panel;
	private JLabel usr;
	private JTextField tf1;
	private JLabel emal;
	private JTextField tf2;
	private JLabel pass;
	private JPasswordField PasswordField;
	private JButton btn;

	//create a window
	public mity(){
		super("Login");

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel, BorderLayout.CENTER);

		usr = new JLabel("Username");
		usr.setBounds(30, 45, 7, 6);
		panel.add(usr);

		tf1 = new JTextField(18);
		tf1.setBounds(70, 45, 18, 18);
		//add ActionListener
		tf1.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JOptionPane.showMessageDialog(null, "Next step", "User Identified", JOptionPane.INFORMATION_MESSAGE);

					}
				}
		);
		panel.add(tf1);

		emal = new JLabel("Email Address");
		emal.setBounds(30, 70, 7, 6);
		panel.add(emal);

		tf2 = new JTextField(18);
		tf2.setBounds(70, 70, 18, 18);
		//add ActionListener
		tf2.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JOptionPane.showMessageDialog(null, "Almost done :) ", "Email recognized", JOptionPane.INFORMATION_MESSAGE);

					}
				}
		);
		panel.add(tf2);

		pass = new JLabel("Password");
		pass.setBounds(30, 110, 7, 6);
		panel.add(pass);

		PasswordField = new JPasswordField(18);
		PasswordField.setBounds(70, 110, 18, 18);
		panel.add(PasswordField);

		btn = new JButton("Sign-in");
		btn.setBounds(30, 130, 7, 5);
		//add ActionListener
		btn.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						JOptionPane.showMessageDialog(null, "Login Successful", "Welcome!", JOptionPane.PLAIN_MESSAGE);

					}
				}
		);
		panel.add(btn);

	}

}
