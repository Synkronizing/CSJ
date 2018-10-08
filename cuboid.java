import javax.swing.JOptionPane;

public class cuboid {
	private double height;
	private double length;
	private double width;
	private double surfaceA;
	private double volume;
	public void setVarsToZero() {
		height = 0.0;
		length = 0.0;
		width = 0.0;
		
	}
	public void setSides() {
		length =Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
		width =Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
		height =Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
		
	}
	public void calcSurfaceA() {
		surfaceA = (2*length*width)+(2*height*length)+(2*width*height);
		
	}
	public void calcVolume() {
		volume = length * width * height;
		
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Width = " + width + " |Length = "+ length+ " |Height = "+height+" |Surface Area = "+surfaceA+ " |Volume = "+volume);
		
	}

}
