import javax.swing.JOptionPane;

public class Sphere {
	private double r;
	private double surfaceA;
	private double volume;
	private double pi;
	private double frac;
	public void setVarsToZero() {
		r= 0.0;
		surfaceA = 0.0;
		volume= 0.0;
		pi = Math.PI;
		frac = 4d/3d;
		
	}
	public void SetSides() {
		r =Double.parseDouble(JOptionPane.showInputDialog("Enter Radius:"));
		
	}
	public void calcSurfaceA() {
		surfaceA = 4*pi*Math.pow(r, 2);
		
	}
	public void calcVolume() {
		volume = frac*pi*Math.pow(r, 3);
		
	}
	public void showVars() {
		JOptionPane.showMessageDialog(null, "Radius = "+r+" |Volume = "+volume+" |Surface Area = "+surfaceA);
		
	}

}
