import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class swingConverter implements ActionListener{
	
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextField sphereText;
	private JTextArea resultArea;
	private JTextArea sresult;
	private JButton enterButton;
	private JButton enterRButton;
	private double pi;
	private double frac;
	
	
	public swingConverter() {
		pi=Math.PI;
		frac = 4d/3d;
		JFrame myWindow = new JFrame("Base Converter - Created by Josh S");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myWindow.add(inputPanel);
		myWindow.setSize(600, 800);
		//myWindow.pack
		myWindow.setVisible(true);
	}
	private JPanel initInputPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new java.awt.Dimension(600,500));
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
			
		JLabel label = new JLabel("Enter a base-10 number:");
		label.setBounds(50,50,220,30);
		label.setForeground(Color.WHITE);
		panel.add(label);
		
		JTextField text; // weird, but don't freak out
		text = inputText = new JTextField();
		text.setBounds(230,50,100,30);
		text.setForeground(Color.WHITE);
		text.setBackground(Color.DARK_GRAY);
		panel.add(text);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(340,50,80,30);
		button.addActionListener(this);
		button.setBackground(Color.GREEN);
		panel.add(button);
		
		//save to the class variable, to be used in other methods
		enterButton = button; // assign it to a class var to be used in other methods
		
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430,50,80,30);
		button.addActionListener(this);
		button.setBackground(Color.RED);
		panel.add(button);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50,180,500,200);
		resultArea.setEditable(false);
		resultArea.setBackground(Color.DARK_GRAY);
		resultArea.setForeground(Color.WHITE);
		
		
		panel.add(resultArea);
		//Sphere start
		
		label = new JLabel("Enter a radius:");
		label.setBounds(100,420,220,30);
		label.setForeground(Color.WHITE);
		panel.add(label);
		

		text = sphereText = new JTextField();
		text.setBounds(230,420,100,30);
		text.setForeground(Color.WHITE);
		text.setBackground(Color.DARK_GRAY);
		panel.add(text);
		
		button = new JButton("Enter");
		button.setActionCommand("EnterR");
		button.setBounds(340,420,80,30);
		button.addActionListener(this);
		button.setBackground(Color.GREEN);
		panel.add(button);
		
		//save to the class variable, to be used in other methods
		enterRButton = button; // assign it to a class var to be used in other methods
		
		button = new JButton("Reset");
		button.setActionCommand("sReset");
		button.setBounds(430,420,80,30);
		button.addActionListener(this);
		button.setBackground(Color.RED);
		panel.add(button);
		
		sresult = new JTextArea();
		sresult.setBounds(50,500,500,200);
		sresult.setEditable(false);
		sresult.setBackground(Color.DARK_GRAY);
		sresult.setForeground(Color.WHITE);
		panel.add(sresult);
		
		return panel;
	}

	public swingConverter(String name) {
		
	}
	

	
	public static void main(String[] args) throws Exception{
		//swingConverter baseConverter = new swingConverter();
		new swingConverter();
	}

	public void actionPerformed(ActionEvent ev) {
		String command = ev.getActionCommand();
		

		if(command.equals("Enter")) {
			showResult();
		}else if (command.equals("Reset")) {
			doReset();
			
		}else if(command.equals("EnterR")) {
			showSphere();
		}
		else if(command.equals("sReset")) {
			dosReset();
		}
		
	}

	private void dosReset() {
		sphereText.setText("");
		sphereText.setEnabled(true);
		enterRButton.setEnabled(true);
		sphereText.requestFocus();
		sresult.setText("");
		
	}
	private void showSphere() {
		sphereText.setEnabled(false);
		enterRButton.setEnabled(false);
		
		Integer n = getInputRadius();
		if(n==null) {
			resultArea.append("Invalid number!");
			return;
		}
		int radius = n.intValue();
		sresult.append("Radius = "+ radius+"\n");
		sresult.append("Volume = "+ frac*pi*Math.pow(radius,3)+"\n");
		sresult.append("Surface Area = "+ 4*pi*Math.pow(radius,2)+"\n");


		
	}
	private void doReset() {
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
		
	}

	private void showResult() {
		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		
		Integer n = getInputNumber();
		if(n==null) {
			resultArea.append("Invalid number!");
			return;
		}
		int baseTenNumber = n.intValue();
		resultArea.append("Base 10 = "+ baseTenNumber+"\n");
		resultArea.append("Binary = "+ Integer.toString(baseTenNumber,2)+"\n");
		resultArea.append("Octal = "+ Integer.toString(baseTenNumber,8)+"\n");
		resultArea.append("Hexadecimal = "+ Integer.toString(baseTenNumber,16)+"\n");
		hexUpperCase = ("Hexadecimal = "+ Integer.toString(baseTenNumber,16).toUpperCase());
		resultArea.append(hexUpperCase);
	}
	private Integer getInputRadius() {
		try {
			Integer n = Integer.parseInt(sphereText.getText());
			return n;
		}catch (Exception e) {
			return null;
	/*
	oops! Problem with number entry
	this traps that error, now tell user the error
	and let them try an entry again
	return null is to prevent a total crash, but
	it really is not fixing the problem
	NOT GOOD
	*/
		}
}
	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		}catch (Exception e) {
			return null;
		}
	}
			
			

}
