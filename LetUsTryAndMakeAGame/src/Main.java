/* Concept text parser, Welcome to Hell v0.1
 * bugfixes will be denoted by a number after a second decimal. minor revisions 
 * after first decimal
 * major revisions are first
 * copyright Michael Mahan 2015
 * */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		new Main().setVisible(true);
	}
	
	private Main()
	{
		
		super("Welcome to Hell");
		setSize(800, 600);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JPanel frame1 = new JPanel();
		JTextField userInput = new JTextField(40);
		JLabel txtLog = new JLabel();
		add(frame1);
		frame1.add(userInput);
		
		JTextArea log = new JTextArea(5, 20);
		log.setEditable(false);
		
		/* layout types
		 * 
		 * default
		 * FlowLayout
		 * GridBagLayout
		 * GridLayout
		 * BorderLayout
		 * 
		 */
		
		/*
		JButton button = new JButton("Save /often/");
		button.setActionCommand("cliick");
		button.addActionListener(this);
		add(button);
		
		JButton button2 = new JButton("Load");
		button.setActionCommand("cliickity");
		button2.addActionListener(this);
		add(button2);
		*/
		
		JMenuBar menu = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem item = new JMenu("Save");
		JMenuItem save1 = new JMenuItem("Slot 1");
		JMenuItem save2 = new JMenuItem("Slot 2");
		JMenuItem item2 = new JMenu("Load");
		JMenuItem load1 = new JMenuItem("Slot 1");
		JMenuItem load2 = new JMenuItem("Slot 2");
		JMenuItem item3 = new JMenuItem("Exit");
		item.setActionCommand("Save");
		item.addActionListener(this);
		item2.setActionCommand("Load");
		item2.addActionListener(this);
		item3.setActionCommand("Exit");
		item3.addActionListener(this);
		
		setJMenuBar(menu);
		menu.add(file);
		
		file.add(item);
		item.add(save1);
		item.add(save2);
		
		file.add(item2);
		item2.add(load1);
		item2.add(load2);
		
		file.addSeparator();
		
		file.add(item3);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String name = e.getActionCommand();
		
		if(name.equals("Save"))
		{
			System.out.println("Game Saved Successfully");
		}
		else if(name.equals("Load"))
		{
			System.out.println("Game Loaded Successfully");
		}
		else if(name.equals("Exit"))
		{
			System.out.println("Closed");
			System.exit(0);
		}
		
		
		
	}
	
}

