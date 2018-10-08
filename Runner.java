
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JOptionPane;

public class Runner {
	/*
	 * circle: input r, calculate circumference and area
	 * Rectangle input sideA and B, calculate perimter, area, and diagonal
	 * Triangle input sideA, B, C, calc perimeter, area, angles
	 * cubiod: input sides A, B, C, calc volume, total surface area
	 * Sphere: Input radius, calc volume, and surface area
	 */
	
	public static void main(String[] args)
	{
		
		UIManager UI=new UIManager();
		UI.put("OptionPane.background",new ColorUIResource(255,255,255));
		 UI.put("Panel.background",new ColorUIResource(255,255,255));
		 
		int again = 1;
		JOptionPane.showMessageDialog(null, "Josh Sutton / Sept. 14, 2018 / Period 3A");
		
		while(again==1) {
			
			String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, Sphere";
			String answer = JOptionPane.showInputDialog(msg);
			if(answer==null) {
				answer = "No";
			}
			JOptionPane.showMessageDialog(null, "You have picked: "+answer);
		
		//When comparing strings == is unreliable - do not use ==
		//instead, use String class method
		if(answer.equals("Triangle")|| (answer.equals("triangle") ) ) {
			 UI.put("OptionPane.background",new ColorUIResource(255,100,100));
			 UI.put("Panel.background",new ColorUIResource(255,100,100));
			 
			Triangle myTriangle = new Triangle();
			myTriangle.setVarsToZero();
			myTriangle.setSides();
			myTriangle.calcPerimeter();
			myTriangle.calcArea();
			myTriangle.showVars();
			myTriangle.calcAngles();
			myTriangle.showVarsAngles();
		}
		else if(answer.equals("Circle") ||(answer.equals("circle") )){
			UI.put("OptionPane.background",new ColorUIResource(100,255,100));
			 UI.put("Panel.background",new ColorUIResource(100,255,100));
			 
			Circle myCircle = new Circle();
			myCircle.setVarsToZero();
			myCircle.setRadius();
			myCircle.calcCircumference();
			myCircle.calcArea();
			myCircle.showVars();
		}
		else if(answer.equals("Rectangle") ||(answer.equals("rectangle") )) {
			UI.put("OptionPane.background",new ColorUIResource(100,100,255));
			 UI.put("Panel.background",new ColorUIResource(100,100,255));
			Rectangle myRectangle = new Rectangle();
			myRectangle.setVarsToZero();
			myRectangle.setSides();
			myRectangle.calcPerimeter();
			myRectangle.calcArea();
			myRectangle.calcDiag();
			myRectangle.showVars();
		}
		else if(answer.equals("cuboid")|| (answer.equals("Cuboid"))) {
			UI.put("OptionPane.background",new ColorUIResource(255,100,255));
			 UI.put("Panel.background",new ColorUIResource(255,100,255));
			 
			cuboid mycuboid = new cuboid();
			mycuboid.setVarsToZero();
			mycuboid.setSides();
			mycuboid.calcSurfaceA();
			mycuboid.calcVolume();
			mycuboid.showVars();
		}
		else if(answer.equals("sphere")|| (answer.equals("Sphere"))){
			UI.put("OptionPane.background",new ColorUIResource(255,255,100));
			 UI.put("Panel.background",new ColorUIResource(255,255,100));
			 
			Sphere mySphere = new Sphere();
			mySphere.setVarsToZero();
			mySphere.SetSides();
			mySphere.calcSurfaceA();
			mySphere.calcVolume();
			mySphere.showVars();
		}
		else if (answer=="No") {
			UI.put("OptionPane.background",new ColorUIResource(255,0,0));
			 UI.put("Panel.background",new ColorUIResource(255,0,0));
			 
			JOptionPane.showMessageDialog(null, "Thank you for coming");
			
		}
		else {
			UI.put("OptionPane.background",new ColorUIResource(255,0,0));
			 UI.put("Panel.background",new ColorUIResource(255,0,0));
			 
			JOptionPane.showMessageDialog(null, "I don't think that was one of the choices");
		}
		UI.put("OptionPane.background",new ColorUIResource(255,255,255));
		 UI.put("Panel.background",new ColorUIResource(255,255,255));
		 
		msg = "Would you like to go again? Y/N";
		answer = JOptionPane.showInputDialog(msg);
		if(again!=1 ||answer==null) {
			answer = "no";
		}
		JOptionPane.showMessageDialog(null, "You have picked: "+answer);
		if(answer.equals("y")||answer.equals("Y")||answer.equals("yes")||answer.equals("Yes")){
			again = 1;
		}
		else {
			again = 0;
		}
		
		}
		
	}
}
