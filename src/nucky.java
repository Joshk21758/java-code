//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//public class for JFrame
public class nucky extends JFrame{
	private JList leftlist;
	private static String[] cars = {"Mercedes", "Run-X", "Alphad", "Lamborghini", "Buggati", "Rolls-Royce", "Audi"};
	private JButton btn;
	private JList rightlist;

	//create a window
	public nucky(){
		super("Car dealer");
		setLayout(new FlowLayout());

		leftlist = new JList(cars);
		leftlist.setVisibleRowCount(5);
		leftlist.setFixedCellWidth(50);
		leftlist.setFixedCellHeight(40);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(leftlist);

		btn = new JButton("Purchase --> ");
		//add ActionListener
		btn.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						rightlist.setListData(leftlist.getSelectedValues());

					}
				}
		);
		add(btn);

		rightlist = new JList();
		rightlist.setVisibleRowCount(4);
		rightlist.setFixedCellWidth(50);
		rightlist.setFixedCellHeight(40);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(rightlist);

	}
}