import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingFiles {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("/home/compsci/eclipse-workspace/textfiles/output.txt");
		for(int i = 0; i <= 10; i++) {
			out.println(i);
		}
		
		out.close();

	}

}
