package mousedraw;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MouseDraw extends JFrame {
	
	JMenuBar mainMenuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("File");
	
	JMenuItem newMenuItem = new JMenuItem("New");
	JMenuItem exitMenuItem = new JMenuItem("Exit");
	
	Graphics2D g2D;

	public MouseDraw() {

		// frame constructor
		setTitle("Aristic Creations by Josh S October 2018");
		setResizable(false);
		setSize(600, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}

		});
		getContentPane().setLayout(new GridBagLayout());
		getContentPane().setBackground(new Color(3, 106, 112));
		setJMenuBar(mainMenuBar);
		
		fileMenu.setMnemonic('F');
		mainMenuBar.add(fileMenu);
		mainMenuBar.setBackground(new Color(234, 105, 105));
		fileMenu.add(newMenuItem);
		newMenuItem.setBackground(new Color(234, 105, 105));
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		exitMenuItem.setBackground(new Color(234, 105, 105));
		
		newMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				newMenuItemActionPerformed(e);
			}

		});
		exitMenuItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				exitMenuItemActionPerformed(e);
			}

			
		});
	}// end of constructor

	private void exitForm(WindowEvent e) {

		g2D.dispose();
		System.exit(1);
	}
	
	private void newMenuItemActionPerformed(ActionEvent e) {
		
		
	}
	
	private void exitMenuItemActionPerformed(ActionEvent e) {
		int response;
		response = JOptionPane.showConfirmDialog(
				null, 
				"Are you sure you want to exit?",
				"Exit Program",
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
		if(response == JOptionPane.NO_OPTION) {
			return;
		}else {
			exitForm(null);
		}
		
		
	}
}// end of class MouseDraw
