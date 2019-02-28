import java.util.ArrayList;



public class SlideShow {
	
	private int numOfPhotos;
	private ArrayList<Slide> slides;
	private ArrayList<Slide> finalSlides = new ArrayList<>();
	private InterestFactor interestFactor;
	
	public SlideShow(ArrayList<Slide> slides) {
		this.slides = slides;
	}
	
	
	public void addPhoto(Photo photo) {
		
	}
	
	private void createSlideShow() {
		Slide currentSlide = slides.get(0);
		Slide newSlide;
		int currentInterestFactor = 0;
		finalSlides.add(slides.get(0));
		boolean canContinue = true;
		
		while(canContinue) {
			for(Slide s : slides) {
				if(!finalSlides.contains(s)) {
					interestFactor = new InterestFactor(currentSlide, s);
					if(interestFactor.getInterestFactor() > currentInterestFactor) {
						newSlide = s;
						currentInterestFactor = interestFactor.getInterestFactor();
					}
				}
			}
		}
		
	}
	
	
	private Slide root = slides.get(0);
	private Slide current = slides.get(0);
	
	private void setSlides(Slide current, Slide newSlide) {
		
	}
	
	private Slide getBestSlide(Slide a, Slide b) {
		Slide newSlide = null;
		int currentInterestFactor = 0;		
		for(Slide s : slides) {
			if(!finalSlides.contains(s)) {
				interestFactor = new InterestFactor(current, s);
				if(interestFactor.getInterestFactor() > currentInterestFactor) {
					newSlide = s;
					currentInterestFactor = interestFactor.getInterestFactor();
				}
			}
		}
		return newSlide;
	}
	
}
