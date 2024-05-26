//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class litty extends JFrame{
	private JPanel panel;
	private JComboBox box;
	private static String[] colornames = {"Black", "Red", "Blue", "Cyan", "Yellow", "Green"};
	private Color[] colors = {Color.BLACK, Color.RED, Color.BLUE, Color.CYAN, Color.YELLOW, Color.GREEN};

	//create a window
	public litty(){
		super("Color selection");

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		add(panel, BorderLayout.CENTER);

		box = new JComboBox(colornames);
		//Add ItemListener
		box.addItemListener(
				new ItemListener(){
					//ItemListener method
					public void itemStateChanged(ItemEvent event){
						if(event.getStateChange() == ItemEvent.SELECTED)
							panel.setBackground(colors[box.getSelectedIndex()]);

					}
				}
		);
		panel.add(box, BorderLayout.WEST);


	}

}
