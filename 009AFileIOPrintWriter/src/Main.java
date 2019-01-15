import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Credits.txt");
			PrintWriter pw = new PrintWriter(fw);
			
			
			pw.println("Course: 30 credits");
			pw.println("Year: 120 credits");
			pw.println("Degree: 360 credits");
			
			pw.close();
		} catch(IOException e) {
			System.out.println("IO Error" + e);
		}

	}

}
