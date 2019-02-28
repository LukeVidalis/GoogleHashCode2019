import java.io.IOException;
import java.util.ArrayList;

public class MainAlbum {
	private ArrayList<Slide> slides;
	private ArrayList<Photo> verticalPhotos;
	private ArrayList<Photo> horizontalPhotos;

	private ArrayList<String> data;

	private fileReader fr;

	public MainAlbum() throws IOException {
		slides = new ArrayList<Slide>();
		verticalPhotos = new ArrayList<Photo>();
		horizontalPhotos = new ArrayList<Photo>();

		fr = new fileReader(2);
		data = fr.getFileData();
		setupPhotos(data);
<<<<<<< HEAD:src/main.java
		PairingAlgorithm pa = new PairingAlgorithm(verticalPhotos);
=======
		
>>>>>>> origin/master:src/MainAlbum.java
	}

	private void setupPhotos(ArrayList<String> list) {
		Photo p;
		for (String line : list) {
			System.out.println(line);
			p = new Photo(line);
			if(p.getOrientation().equals("V")) {
				verticalPhotos.add(p);
			}else if(p.getOrientation().equals("H")) {
				horizontalPhotos.add(p);
			}else {
				System.out.println("Error: Wrong Orientation");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new MainAlbum();
	}

}
