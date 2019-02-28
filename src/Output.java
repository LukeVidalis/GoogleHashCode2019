import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Output {

	public Output(ArrayList<Slide> slides) throws IOException {
		addData(slides);
	}
	public void addData(ArrayList<Slide> slides) throws IOException {
		String fileName = "output.txt";
		PrintStream pw = new PrintStream(new FileOutputStream(fileName), true, "UTF-8");
		
	
	
		
		pw.append(slides.size() + "\n");

		for (int i = 0; i < slides.size(); i++) {

			pw.append(slides.get(i).toString());

			if (i != slides.size() - 1) {
				pw.append("\n");
			
			}
		}
		

		pw.flush();
		pw.close();
	}
}
