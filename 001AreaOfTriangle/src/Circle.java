import java.util.Scanner;

import javax.swing.JOptionPane;
public class Circle {
	private double radius;
	private double circumference;
	private double theArea;
	private double pi;
	
	public Circle() {
		
	}

	public void setVarsToZero() {
		radius=0.0;
		theArea=0.0;
		circumference=0.0;
		pi=Math.PI;
		
	}

	public void setRadius() {
		//System.out.println("Enter Radius of Circle:");
		//radius = keyboard.nextDouble();
		radius =Double.parseDouble(JOptionPane.showInputDialog("Enter Radius"));
		
	}

	public void calcCircumference() {
		circumference = 2*pi*radius;
		
	}

	public void calcArea() {
		theArea=Math.pow(radius, 2)*pi;
		
	}

	public void showVars() {
		//System.out.println("	Radius = "+ radius);
		//System.out.println("	Circumference = "+ circumference);
		//System.out.println("	Area = "+ theArea);
		JOptionPane.showMessageDialog(null, "Radius: "+ radius+"; Circumference: "+ circumference + "; Area:"+ theArea);
		
	}
	
	
}
