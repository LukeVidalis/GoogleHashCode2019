import java.util.ArrayList;

public class PairingAlgorithm {
	
	private ArrayList<Slide> slides = new ArrayList<Slide>();
	private ArrayList<Photo> photos;

	public PairingAlgorithm(ArrayList<Photo> photos) {
		setPhotos(photos);
		for(int i=0;i<photos.size();i++) {
			ArrayList<Photo> s = new ArrayList<Photo>();
			s.add(photos.get(i));
			s.add(getPair(photos.get(i), i));
			photos.remove(i);
			Slide slide = new Slide(s);
			slides.add(slide);
		}
		for(Slide s: slides) {
			System.out.println(s.getTags());
		}
	}
	
	public void createSlideShow() {
		
	}

	public void setPhotos(ArrayList<Photo> photos) {
		this.photos = photos;
	}
	
	public Photo getPair(Photo photo, int i) {
		Photo result = photos.get(i);
		int tags = 0;
		for(int j=i;j<photos.size();j++) {
			ArrayList<Photo> s = new ArrayList<Photo>();
			s.add(photos.get(i));
			s.add(photos.get(j));
			Slide slide = new Slide(s);
			int score = slide.getTags().size();
			if(score > tags) {
				tags = score;
				result = photos.get(j);
			}
		}
		photos.remove(result);
		return result;
	}

	public ArrayList<Slide> getSlides() {
		return slides;
	}

}
