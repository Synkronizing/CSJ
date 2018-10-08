import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double aDeg,bDeg,cDeg;
	private double perimeter;
	private double theArea;
	
	Scanner keyboard = new Scanner(System.in);
	// constructor goes here
	public Triangle() {
		
	}

	// methods go here
	public void setVarsToZero() {
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		aDeg=0.0;
		bDeg=0.0;
		cDeg=0.0;
		perimeter = 0.0;
		theArea = 0.0;
	}// end of setVarsToZero
	public void showVars() {
		//System.out.println("Measurements:");
		//System.out.println("	Side A = "+ sideA);
		//System.out.println("	Side B = "+ sideB);
		//System.out.println("	Side C = "+ sideC);
		//System.out.println("	Area = "+ theArea);
		//System.out.println("	Perimeter = "+ perimeter);
		
		String msg = "Side A, B, C = "+ sideA + ", "+ sideB +", "+ sideC
				+"; periemter: " + perimeter + "; Area: " + theArea;
		
		JOptionPane.showMessageDialog(null, msg );
	}//end of showVars 
	public void setSides() {
		boolean b = true;
		while(b) {
			try {
				sideA =Double.parseDouble(JOptionPane.showInputDialog("Enter Side A length:"));
				b = false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a NUMBER");
			}
		}
		b = true;
		while(b) {
			try {
				sideB =Double.parseDouble(JOptionPane.showInputDialog("Enter Side B length:"));	
				b=false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a NUMBER");
			}
		}
		b = true;
		while(b) {
			try {
				sideC =Double.parseDouble(JOptionPane.showInputDialog("Enter Side C length:"));
				b=false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please enter a NUMBER");
			}
	}
	}

	public void calcPerimeter() {
		perimeter = sideA+sideB+sideC;
		
	}

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB +sideC)/2.0;
		theArea = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
		
		
	}

	public void calcAngles() {
		double cosA = 0.0, aCos=0.0, cosB=0.0, bCos=0.0,cosC=0.0,cCos=0.0;
		cosA = (Math.pow(sideB, 2.0)+ Math.pow(sideC, 2.0)- Math.pow(sideA, 2.0))/(2.0*sideB*sideC);
		aCos =Math.acos(cosA);
		aDeg = Math.toDegrees(aCos);
		
		cosB = (Math.pow(sideA, 2.0)+ Math.pow(sideC, 2.0)- Math.pow(sideB, 2.0))/(2.0*sideA*sideC);
		bCos =Math.acos(cosB);
		bDeg = Math.toDegrees(bCos);
		
		cosC = (Math.pow(sideA, 2.0)+ Math.pow(sideB, 2.0)- Math.pow(sideC, 2.0))/(2.0*sideA*sideB);
		cCos =Math.acos(cosC);
		cDeg = Math.toDegrees(cCos);
		
	}

	public void showVarsAngles() {
		//System.out.println("	Angle A = "+ aDeg+"°");
		//System.out.println("	Angle B = "+ bDeg+"°");
		//System.out.println("	Angle C = "+ cDeg+"°");
		JOptionPane.showMessageDialog(null, "Angle A, B, C = "+aDeg+"°"+", "+bDeg+"°"+", "+ cDeg+"°");
	
	}
}// end of class
