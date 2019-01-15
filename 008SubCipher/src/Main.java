import javax.swing.JOptionPane;

public class Main {
	public static void main(String[]args) {
		String ans;
		Cipher openCaesar = new Cipher();
		
		// first, ask if they want to encrypt or decrypt
		ans = openCaesar.encryptDecrypt();
		
		if(ans.equals("E")) {
			JOptionPane.showMessageDialog(null,"You chose to encrypt ");
			openCaesar.getplainText();
			openCaesar.getKey();
			openCaesar.encrypt();
		}
		else {
			JOptionPane.showMessageDialog(null,"You chose to decrypt ");
			openCaesar.getEncodedText();
			openCaesar.getKey();
			openCaesar.decrypt();
		}
		
	}
}
