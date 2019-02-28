import java.io.IOException;
import java.util.ArrayList;

public class main {
	private ArrayList<Slide> slides;
	private ArrayList<Photo> verticalPhotos;
	private ArrayList<Photo> horizontalPhotos;

	private ArrayList<String> data;

	private fileReader fr;

	public main() throws IOException {
		slides = new ArrayList<Slide>();
		verticalPhotos = new ArrayList<Photo>();

		fr = new fileReader(0);
		data = fr.getFileData();
		setupPhotos(data);
	}

	private void setupPhotos(ArrayList<String> list) {
		Photo p;
		for (String line : list) {
			p = new Photo(line);
			if(p.getOrientation().equals("V")) {
				verticalPhotos.add(p);
			}else if(p.getOrientation().equals("H")) {
				horizontalPhotos.add(p);
			}else {
				System.out.println("Error: Wrong orientation");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new main();
	}

}
