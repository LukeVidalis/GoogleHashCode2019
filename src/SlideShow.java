import java.util.ArrayList;



public class SlideShow {
	
	private int numOfPhotos;
	private ArrayList<Photo> photos = new ArrayList<>();
	private ArrayList<Photo> slides = new ArrayList<>();
	private ArrayList<Slide> finalSlides = new ArrayList<>();
	private InterestFactor interestFactor;
	
	public SlideShow() {
		
	}
	
	public void addPhoto(Photo photo) {
		photos.add(photo);
	}
	
	private void createSlideShow() {
		
	}
	
}
