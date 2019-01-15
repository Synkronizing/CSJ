
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FractionTester {
	public static void main(String[]args) {
		int num = 0;
		int den = 0;
		boolean f = true;
		String symbol = "";
		String contin = "y";
		String msg = "Would you like to go again? Y/N";
		String choice = "What would you like to do? \n Add, Subtract, Multiply, Divide";
		while(contin.equals("y")||contin.equals("Y")) {
			String ans = JOptionPane.showInputDialog(choice);
			String msg1 = "Enter your first fraction 'x/y'";
			String msg2 = "Enter your second fraction 'x/y'";
			String fr1 = JOptionPane.showInputDialog(msg1);
			String fr2 = JOptionPane.showInputDialog(msg2);
			Fraction myFraction = new Fraction(fr1,fr2);
			int num1 = myFraction.getNumerator1();
			int num2 = myFraction.getNumerator2();
			int den1 = myFraction.getDenominator1();
			int den2 = myFraction.getDenominator2();
			if(ans.equals("Add")||ans.equals("add")) {
				Fraction.addSum(num1, num2, den1, den2);
				

				symbol = "+";
			}
			else if(ans.equals("Subtract")||ans.equals("subtract")){
				Fraction.sub(num1,num2,den1,den2);
				symbol = "-";
			}
			else if(ans.equals("Multiply")||ans.equals("multiply")) {
				Fraction.mul(num1,num2,den1,den2);
				symbol = "x";
			}
			else if(ans.equals("Divide")||ans.equals("divide")) {
				Fraction.div(num1,num2,den1,den2);
				symbol = "/";
			}
			num = myFraction.getNumerator3();
			den = myFraction.getDenominator3();
			Fraction.simplify(num,den);
			num = myFraction.getNumerator3();
			den = myFraction.getDenominator3();
			JOptionPane.showMessageDialog(null, "        "+ num1+ "           "+num2+"           "+ num +"\n     -----   "+ symbol +"   -----  =  ------"+"\n        "+den1+"           "+den2+"           "+den);
			
			contin = JOptionPane.showInputDialog(msg);
		}
	}





	
}
