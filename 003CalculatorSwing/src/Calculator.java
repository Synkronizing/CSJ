import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
	
public class Calculator implements ActionListener{
		
		// class vars aka instance variable aka field variables
		JFrame frame;
		JTextField textfield;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,badd,bsub,
		bmul,bdiv,beq,bclr,bksp,bsqr,bcbe,bsqt,blog;
		
		Double firstNumber;
		Double secondNumber;
		Double result;
		int operator;
		//constructor
		Calculator(){
			frame = new JFrame("Calculator Created by Josh S");
			frame.setLayout(null);
			frame.getContentPane().setBackground(new Color(53, 169, 198));
			
			
			textfield = new JTextField();
			textfield.setBounds(30,40,400,30);
			textfield.setBackground(new Color(232, 226, 127));
			
			frame.add(textfield);
			
			b1 = new JButton ("1");
			b1.setFont(new Font("Serif", Font.BOLD,14));
			b1.setForeground(Color.WHITE);
			b1.setBackground(new Color(206, 149, 111));
			
			b2 = new JButton ("2");
			b2.setFont(new Font("Serif", Font.BOLD,14));
			b2.setForeground(Color.WHITE);
			b2.setBackground(new Color(206, 149, 111));
			
			b3 = new JButton ("3");
			b3.setFont(new Font("Serif", Font.BOLD,14));
			b3.setForeground(Color.WHITE);
			b3.setBackground(new Color(206, 149, 111));
			
			b4 = new JButton ("4");
			b4.setFont(new Font("Serif", Font.BOLD,14));
			b4.setForeground(Color.WHITE);
			b4.setBackground(new Color(206, 149, 111));
			
			b5 = new JButton ("5");
			b5.setFont(new Font("Serif", Font.BOLD,14));
			b5.setForeground(Color.WHITE);
			b5.setBackground(new Color(206, 149, 111));
			
			b6 = new JButton ("6");
			b6.setFont(new Font("Serif", Font.BOLD,14));
			b6.setForeground(Color.WHITE);
			b6.setBackground(new Color(206, 149, 111));
			
			b7 = new JButton ("7");
			b7.setFont(new Font("Serif", Font.BOLD,14));
			b7.setForeground(Color.WHITE);
			b7.setBackground(new Color(206, 149, 111));
			
			b8 = new JButton ("8");
			b8.setFont(new Font("Serif", Font.BOLD,14));
			b8.setForeground(Color.WHITE);
			b8.setBackground(new Color(206, 149, 111));
			
			b9 = new JButton ("9");
			b9.setFont(new Font("Serif", Font.BOLD,14));
			b9.setForeground(Color.WHITE);
			b9.setBackground(new Color(206, 149, 111));
			
			b0 = new JButton ("0");
			b0.setFont(new Font("Serif", Font.BOLD,14));
			b0.setForeground(Color.WHITE);
			b0.setBackground(new Color(206, 149, 111));
			
			bdec = new JButton(".");
			bdec.setFont(new Font("Serif", Font.BOLD,14));
			bdec.setForeground(Color.WHITE);
			bdec.setBackground(new Color(206, 149, 111));
			
			bsub = new JButton("-");
			bsub.setFont(new Font("Serif", Font.BOLD,14));
			bsub.setForeground(Color.WHITE);
			bsub.setBackground(new Color(111, 206, 137));
			
			badd = new JButton("+");
			badd.setFont(new Font("Serif", Font.BOLD,14));
			badd.setForeground(Color.WHITE);
			badd.setBackground(new Color(111, 206, 137));
			
			bmul = new JButton("*");
			bmul.setFont(new Font("Serif", Font.BOLD,14));
			bmul.setForeground(Color.WHITE);
			bmul.setBackground(new Color(111, 206, 137));
			
			bdiv = new JButton("/");
			bdiv.setFont(new Font("Serif", Font.BOLD,14));
			bdiv.setForeground(Color.WHITE);
			bdiv.setBackground(new Color(111, 206, 137));
			
			beq = new JButton("=");
			beq.setFont(new Font("Serif", Font.BOLD,14));
			beq.setForeground(Color.WHITE);
			beq.setBackground(new Color(111, 206, 137));
			
			
			bclr = new JButton("Clear");
			bclr.setFont(new Font("Serif", Font.BOLD,14));
			bclr.setForeground(Color.WHITE);
			bclr.setBackground(Color.DARK_GRAY);
			
			bksp= new JButton("⌫");
			bksp.setFont(new Font("Serif", Font.BOLD,14));
			bksp.setForeground(Color.WHITE);
			bksp.setBackground(Color.DARK_GRAY);
			
			bsqr = new JButton("x^2");
			bsqr.setFont(new Font("Serif", Font.BOLD,14));
			bsqr.setForeground(Color.WHITE);
			bsqr.setBackground(new Color(206, 111, 170));

			bcbe = new JButton("x^3");
			bcbe.setFont(new Font("Serif", Font.BOLD,14));
			bcbe.setForeground(Color.WHITE);
			bcbe.setBackground(new Color(206, 111, 170));
			
			bsqt= new JButton("√");
			bsqt.setFont(new Font("Serif", Font.BOLD,14));
			bsqt.setForeground(Color.WHITE);
			bsqt.setBackground(new Color(206, 111, 170));

			blog = new JButton("log[10]");
			blog.setFont(new Font("Serif", Font.BOLD,14));
			blog.setForeground(Color.WHITE);
			blog.setBackground(new Color(206, 111, 170));
			
			bdec.setBounds(40,310,50,40);
			frame.add(bdec);
			b1.setBounds(40,240,50,40);
			frame.add(b1);
			b4.setBounds(40,170,50,40);
			frame.add(b4);
			b7.setBounds(40,100,50,40);
			frame.add(b7);
			
			b0.setBounds(110,310,50,40);
			frame.add(b0);
			b2.setBounds(110,240,50,40);
			frame.add(b2);
			b5.setBounds(110,170,50,40);
			frame.add(b5);
			b8.setBounds(110,100,50,40);
			frame.add(b8);
			
			beq.setBounds(180,310,50,40);
			frame.add(beq);
			b3.setBounds(180,240,50,40);
			frame.add(b3);
			b6.setBounds(180,170,50,40);
			frame.add(b6);
			b9.setBounds(180,100,50,40);
			frame.add(b9);
			
			bmul.setBounds(260,310,50,40);
			frame.add(bmul);
			bdiv.setBounds(260,240,50,40);
			frame.add(bdiv);
			bsub.setBounds(260,170,50,40);
			frame.add(bsub);
			badd.setBounds(260,100,50,40);
			frame.add(badd);
			
			blog.setBounds(330,310,100,40);
			frame.add(blog);
			bsqt.setBounds(330,240,100,40);
			frame.add(bsqt);
			bcbe.setBounds(330,170,100,40);
			frame.add(bcbe);
			bsqr.setBounds(330,100,100,40);
			frame.add(bsqr);
			
			bclr.setBounds(40,380,150,40);
			frame.add(bclr);
			bksp.setBounds(200, 380,150,40);
			frame.add(bksp);
			
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(460, 500);
			frame.setVisible(true);
			
			b0.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			bdec.addActionListener(this);
			badd.addActionListener(this);
			bsub.addActionListener(this);
			bmul.addActionListener(this);
			bdiv.addActionListener(this);
			beq.addActionListener(this);
			bclr.addActionListener(this);
			bksp.addActionListener(this);
			bsqr.addActionListener(this);
			bsqt.addActionListener(this);
			bcbe.addActionListener(this);
			blog.addActionListener(this);
			
			
			
		}
		
		//Listener -- wating for an event, mouse click, mouse over ...
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== b1)
				textfield.setText(textfield.getText().concat("1"));
			if(e.getSource()== b2)
				textfield.setText(textfield.getText().concat("2"));
			if(e.getSource()== b3)
				textfield.setText(textfield.getText().concat("3"));
			if(e.getSource()== b4)
				textfield.setText(textfield.getText().concat("4"));
			if(e.getSource()== b5)
				textfield.setText(textfield.getText().concat("5"));
			if(e.getSource()== b6)
				textfield.setText(textfield.getText().concat("6"));
			if(e.getSource()== b7)
				textfield.setText(textfield.getText().concat("7"));
			if(e.getSource()== b8)
				textfield.setText(textfield.getText().concat("8"));
			if(e.getSource()== b9)
				textfield.setText(textfield.getText().concat("9"));
			if(e.getSource()== b0)
				textfield.setText(textfield.getText().concat("0"));
			if(e.getSource()== bdec)
				textfield.setText(textfield.getText().concat("."));
			if(e.getSource()== bclr)
				textfield.setText("");
			if(e.getSource()==badd) {
				firstNumber = Double.parseDouble(textfield.getText());
				operator = 1;
				textfield.setText("");
			}
			if(e.getSource()==bsub) {
				firstNumber = Double.parseDouble(textfield.getText());
				operator = 2;
				textfield.setText("");
			}
			if(e.getSource()==bmul) {
				firstNumber = Double.parseDouble(textfield.getText());
				operator = 3;
				textfield.setText("");
			}
			if(e.getSource()==bdiv) {
				firstNumber = Double.parseDouble(textfield.getText());
				operator = 4;
				textfield.setText("");
			}
			if(e.getSource()==bsqr) {
				firstNumber = Double.parseDouble(textfield.getText());
				result = Math.pow(firstNumber, 2);
				textfield.setText(""+result);
			}
			if(e.getSource()==bcbe) {
				firstNumber = Double.parseDouble(textfield.getText());
				result = Math.pow(firstNumber, 3);
				textfield.setText(""+result);
			}
			if(e.getSource()==bsqt) {
				firstNumber = Double.parseDouble(textfield.getText());
				result = Math.pow(firstNumber, 0.5);
				textfield.setText(""+result);
			}
			if(e.getSource()==blog) {
				firstNumber = Double.parseDouble(textfield.getText());
				result = Math.log10(firstNumber);
				textfield.setText(""+result);
			}
			if(e.getSource()==bksp) {
				//s is what was in the text field
				String s=textfield.getText();
				//clear text field
				textfield.setText("");
				//for every character in s minus one,
				for(int i=0;i<s.length()-1;i++) {
					//add that character from s into the text field
					textfield.setText(textfield.getText()+s.charAt(i));
				}
			}
			if(e.getSource()==beq) {
				secondNumber = Double.parseDouble(textfield.getText());
				
			switch(operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				default: result = 0d;
				}
			textfield.setText(""+ result);
			}
		}
		//Handler methods
	}// end of Calculator Class

