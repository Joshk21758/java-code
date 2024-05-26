//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class popy extends JFrame{
	private JPanel panel;
	private Color color = (Color.WHITE);
	private JButton btn;

	//create a window
	public popy(){
		super("Color program");

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		btn = new JButton("Choose a color");
		//Add ActionListener
		btn.addActionListener(
				new ActionListener(){

					//ActionListener method
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "Pick your color", color);
						if(color == null)
							color = (Color.WHITE);

						panel.setBackground(color);

					}
				}

		);
		panel.add(btn, BorderLayout.SOUTH);

	}
}
