//import java packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//public class for JFrame
public class sedu extends JFrame{
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;

	//create a window
	public sedu(){
		super("Pick a font");
		setLayout(new FlowLayout());

		tf = new JTextField("This is a sentence", 20);
		tf.setBounds(0, 0, 20, 15);
		add(tf);

		pf = new Font("serif", Font.PLAIN, 15);
		bf = new Font("serif", Font.BOLD, 15);
		itf = new Font("serif", Font.ITALIC, 15);
		bif = new Font("serif", Font.BOLD + Font.ITALIC, 15);

		pb = new JRadioButton("Plain");
		bb = new JRadioButton("Bold");
		ib = new JRadioButton("Italic");
		bib = new JRadioButton("Bold & Italic");
		add(pb);
		add(bb);
		add(ib);
		add(bib);

		//Add ItemListener
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));

		//Add ButtonGroup
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);

	}
	//private class for HandlerClass
	private class HandlerClass implements ItemListener{
		private Font font;

		public HandlerClass(Font f){
			font = f;

		}
		//ItemListener method
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);

		}
	}
}
