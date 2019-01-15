import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Adds two fractions together. Learn Javadocs. Enter the two fractions as Strings
 * then use String methods to pull our numerator and denominator
 * Use common denominator to add, then reduce to lowest common denominator
 * (first part of grading with Javadocs)
 * (Second part of grading: Add, subtract, multiply, divide with Javadocs)
 * 
 * @author Josh S
 *
 */
public class Fraction {
	//<-------------------- field -------------------->//
	
	private int numerator1;
	private int denominator1;
	
	private int numerator2;
	private int denominator2;
	private static int numerator3;
	private static int denominator3;
	
	
	
	//<-------------------- constructor -------------------->//
	
	
public Fraction(String passFraction1,String passFraction2) {
		int separatorLocation = passFraction1.indexOf("/");
		String strNumerator1 = passFraction1.substring(0,separatorLocation);
		String strDenominator1 = passFraction1.substring(separatorLocation + 1);
		
		int separatorLocation2 = passFraction2.indexOf("/");
		String strNumerator2 = passFraction2.substring(0,separatorLocation2);
		String strDenominator2 = passFraction2.substring(separatorLocation2 + 1);
		
		this.numerator1 = Integer.parseInt(strNumerator1);
		this.denominator1 = Integer.parseInt(strDenominator1);
		
		this.numerator2 = Integer.parseInt(strNumerator2);
		this.denominator2 = Integer.parseInt(strDenominator2);
		
	}

public static void addSum(int num1, int num2, int den1, int den2) {
	int sumNum = (num1 * den2)+ (num2*den1);
	int sumDen = den1* den2;

	numerator3 = sumNum;
	denominator3 = sumDen;
	
}

public static void sub(int num1, int num2, int den1, int den2) {
	int subNum = (num1 * den2)-(num2*den1);
	int subDen = den1* den2;
	
	numerator3 = subNum;
	denominator3 = subDen;
}
public static void mul(int num1, int num2, int den1, int den2) {
	int mulNum = num1 * num2;
	int mulDen = den1 * den2;
	numerator3 = mulNum;
	denominator3 = mulDen;
	
}
public static void div(int num1, int num2, int den1, int den2) {
	int divNum = num1 * den2;
	int divDen = den1 * num2;
	numerator3 = divNum;
	denominator3 = divDen;
	
}


	//<-------------------- methods -------------------->//
	public int getNumerator1() {
		return numerator1;
	}
	public void setNumerator1(int numerator) {
		this.numerator1 = numerator;
	}
	public int getDenominator1() {
		return denominator1;
	}
	public void setDenominator1(int denominator) {
		this.denominator1 = denominator;
	}
	
	public int getNumerator2() {
		return numerator2;
	}
	public void setNumerator2(int numerator) {
		this.numerator2 = numerator;
	}
	public int getDenominator2() {
		return denominator2;
	}
	public void setDenominator2(int denominator) {
		this.denominator2 = denominator;
	}
	
	public int getNumerator3() {
		return numerator3;
	}
	public void setNumerator3(int numerator) {
		this.numerator3 = numerator;
	}
	public int getDenominator3() {
		return denominator3;
	}
	public void setDenominator3(int denominator) {
		this.denominator3 = denominator;
	}

	public static void simplify(int num, int den) {
		int a = 2;
		while(a<10) {
			if((num%a == 0) && (den%a==0)){
				num = num/a;
				den= den/a;
				a = 2;
			}
			else {
				a++;
			}
				
		}
		numerator3 = num;
		denominator3 = den;
		
		
	}

	


	

	
}
