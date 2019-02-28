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

		fr = new fileReader(1);
		data = fr.getFileData();
		setupPhotos(data);
		PairingAlgorithm pa = new PairingAlgorithm(verticalPhotos);
		for(Slide s : pa.getSlides()) {
			slides.add(s);
		}
		SlideShow ss = new SlideShow(slides);
		Output o = new Output(ss.getBestSlideShow());
	}

	private void setupPhotos(ArrayList<String> list) {
		Photo p;
		for (String line : list) {
			System.out.println(line);
			p = new Photo(line);
			if(p.getOrientation().equals("V")) {
				verticalPhotos.add(p);
			}else if(p.getOrientation().equals("H")) {
				ArrayList<Photo> a = new ArrayList<Photo>();
				a.add(p);
				slides.add(new Slide(a));
			}else {
				System.out.println("Error: Wrong Orientation");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		new MainAlbum();
	}

}
