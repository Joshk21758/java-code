//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//public class for JFrame
public class niko extends JFrame{
	private JList leftlist;
	private static String[] cars = {"Benz", "Ford ranger", "BMW", "Volkswagen", "RunX", "MarkX"};
	private JButton btn;
	private JList rightlist;

	//create a window
	public niko(){
		super("Pick your cars");
		setLayout(new FlowLayout());

		leftlist = new JList(cars);
		leftlist.setVisibleRowCount(4);
		leftlist.setFixedCellWidth(75);
		leftlist.setFixedCellHeight(25);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));

		btn = new JButton("Transfer -->");
		//Add ActionListener
		btn.addActionListener(
				new ActionListener(){
					//ActionListener method
					public void actionPerformed(ActionEvent event){
						rightlist.setListData(leftlist.getSelectedValues());

					}
				}
		);
		add(btn);

		rightlist = new JList();
		rightlist.setVisibleRowCount(4);
		rightlist.setFixedCellWidth(75);
		rightlist.setFixedCellHeight(25);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));

	}
}
