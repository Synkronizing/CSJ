package findtreasure;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FindTreasure extends JFrame  {

	// <-------- Field Variables -------->
	int rowCount = 5;
	int colCount = 5;
	JLabel[][] choiceLabel = new JLabel[rowCount][colCount];
	ImageIcon gold = new ImageIcon("gold.png");
	ImageIcon ghost = new ImageIcon("ghost.png");
	JButton newButton = new JButton();
	int goldLocation;
	int goldLocation2;
	int monsterLocation;
	int monsterLocation2;
	int counter;
	JLabel counterdisplay = new JLabel();
	Random myRandom = new Random();
		
	
	// <-------- Constructor -------->
	public FindTreasure() {
		
		setTitle("Find the gold! - by Josh Sutton");
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent evt) {
				
				exitForm(evt);
			}
		});
		
		getContentPane().setLayout(new GridBagLayout());
		
		GridBagConstraints gridConstraints;
		counterdisplay.setText("counter: "+counter);
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = rowCount/3;
		gridConstraints.gridy = colCount+1;
		gridConstraints.insets = new Insets(10,10,10,10);
		getContentPane().add(counterdisplay, gridConstraints);
		// Required: Set a layout manager, or use null
		for(int b=0;b<colCount;b++) {
			for(int a=0;a<rowCount;a++) {
				choiceLabel[a][b] = new JLabel();
			}
		}
		
		for (int j = 0; j < colCount; j++) {
				  for (int i = 0; i < rowCount; i++) {
				    gridConstraints = new GridBagConstraints();
					choiceLabel[i][j].setPreferredSize(new Dimension(gold.getIconWidth(), gold.getIconHeight()));
					choiceLabel[i][j].setOpaque(true);
					choiceLabel[i][j].setBackground(Color.RED);
					gridConstraints.gridx = i;
					gridConstraints.gridy = j;
					gridConstraints.insets = new Insets(10, 10, 10, 10);
					getContentPane().add(choiceLabel[i][j], gridConstraints);
					choiceLabel[i][j].addMouseListener(new MouseAdapter() {
					
						public void mouseClicked(MouseEvent e) {
							
							labelgoldClicked(e);
						}

						
					});
				  }
			
		}
		 //setVisible(true);
		newButton.setText("Play Again");
		gridConstraints = new GridBagConstraints();
		gridConstraints.gridx = rowCount/2;
		gridConstraints.gridy = colCount+1;
		gridConstraints.insets = new Insets(10,10,10,10);
		getContentPane().add(newButton, gridConstraints);
		newButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				newButtonActionPerformed(e);
			}

			
		});
		getContentPane().setBackground(new Color(234,124,235));
		pack();
		setLocationRelativeTo(null);
		newButton.doClick();
	} // End of Constructor
	
	
	
	// <-------- Methods -------->
	private void exitForm(WindowEvent evt) {
		System.exit(0);
	}
	private void labelgoldClicked(MouseEvent e) 
	{
		Component clickedComponent = e.getComponent();
		int choice;
		for(choice=0;choice<colCount;choice++) {
			for (int choice2=0;choice2 < rowCount;choice2++)
			{
				if(clickedComponent == choiceLabel[choice][choice2])
				{
					choiceLabel[choice][choice2].setBackground(Color.WHITE);
					counter++;
					counterdisplay.setText("counter: "+counter);
					if(choice == goldLocation && choice2 == goldLocation2) {
						choiceLabel[choice][choice2].setIcon(gold);
						newButton.setEnabled(true);
						counter = 0;
						counterdisplay.setText("counter: "+counter);
						JOptionPane.showMessageDialog(null, "You Win");
					}
					else if(choice== monsterLocation && choice2 == monsterLocation2){
						choiceLabel[choice][choice2].setIcon(ghost);
						newButton.setEnabled(true);
						counter = 0;
						counterdisplay.setText("counter: "+counter);
						JOptionPane.showMessageDialog(null,"You Lose");
					}
				}
				
			}
		}
		
	}
	private void newButtonActionPerformed(ActionEvent e) {
		// clear boxes and hide gold
		for(int j=0; j<colCount;j++) {
			for(int i =0; i<rowCount; i++)
			{
				choiceLabel[i][j].setIcon(null);
				choiceLabel[i][j].setBackground(Color.RED);
			}
		}
		boolean f = false;
		goldLocation = myRandom.nextInt(rowCount);
		goldLocation2 = myRandom.nextInt(colCount);
		monsterLocation = myRandom.nextInt(rowCount);
		monsterLocation2 = myRandom.nextInt(colCount);
		while(f==false) {
			if(monsterLocation==goldLocation && monsterLocation2 == goldLocation2) {
				monsterLocation = myRandom.nextInt(rowCount);
				monsterLocation2 = myRandom.nextInt(colCount);
			}
			else {
				f=true;
			}
		}
		
		newButton.setEnabled(false);
		
	}
	
} // End of class FindTreasure
