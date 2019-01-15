import java.util.Scanner;

import javax.swing.JOptionPane;



public class Cipher {
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:";
	private String plainText = "";
	private String encodedText = "";
	private String ans;
	private int key = 0;
	Scanner keyboard = new Scanner(System.in);
	public Cipher() {
		
	}
	public void getplainText() {
		plainText = JOptionPane.showInputDialog("Please enter the plain text message").toLowerCase();
		JOptionPane.showMessageDialog(null,"You have entered: "+ plainText);
		
	}
	public void getEncodedText() {
		encodedText = JOptionPane.showInputDialog("Please enter the encoded text message").toLowerCase();
		JOptionPane.showMessageDialog(null,"You have entered: "+ encodedText);
		
		
	}
	public void getKey() {
		String ans = JOptionPane.showInputDialog("Please enter the shift key");
		key = Integer.parseInt(ans);
		JOptionPane.showMessageDialog(null,"You have entered: "+ key);
		
	}
	public String encryptDecrypt() {
		boolean f = false;
		while(f== false) {
			ans = JOptionPane.showInputDialog("What do you want to do (encrypt or decrypt)");

			ans = String.valueOf(ans.charAt(0)).toUpperCase();
		if(ans.equals("E")||ans.equals("D")) {
				f=true;
			}
			else{
				JOptionPane.showMessageDialog(null,"That was not one of the choices");
			}
		}
		
		return(ans);
		
	}
	public void decrypt() {
		for(int i=0;i<encodedText.length();i++) {
			if(String.valueOf(encodedText.charAt(i)).equals(" ")) {
				plainText += " ";
			}
			
			else {
				char a = encodedText.charAt(i);
				int index =alpha.indexOf(a);
				index = (index - key);
				while(index<0) {
					if(index<0) {
						index += alpha.length();
					}
				}
				plainText += alpha.charAt(index);
			}
		}
			
		JOptionPane.showMessageDialog(null,plainText);
		
		
	}
	public void encrypt() {
		for(int i=0;i<plainText.length();i++) {
			
			if(!alpha.contains(String.valueOf(plainText.charAt(i)))) {
				encodedText +=" ";
			}
			else {
				char a = plainText.charAt(i);
				int index =alpha.indexOf(a);
				index = (index + key)%alpha.length();
				encodedText += alpha.charAt(index);
			}
		}
		JOptionPane.showMessageDialog(null,encodedText);
		
	}	


}
