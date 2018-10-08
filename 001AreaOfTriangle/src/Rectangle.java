import javax.swing.JOptionPane;

public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;
	private double diagonal;
	public Rectangle() {
		
	}

	public void setVarsToZero() {
		width=0.0;
		length=0.0;
		perimeter=0.0;
		area=0.0;
		diagonal=0.0;
		
	}

	public void calcPerimeter() {
		perimeter = (2*length) + (2*width);
		
	}

	public void calcArea() {
		area = length * width;
		
	}

	public void showVars() {
		JOptionPane.showMessageDialog(null, "width = " + width + " |length = "+ length+ " | Diagonal = "+diagonal+ " |Area = "+area+" |Perimeter = "+perimeter);
		
	}

	public void setSides() {
		length =Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
		width =Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
		
	}

	public void calcDiag() {
		diagonal= Math.sqrt( Math.pow(length, 2)+ Math.pow(width, 2));
		
	}
	
}
