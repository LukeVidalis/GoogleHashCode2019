import java.util.ArrayList;



public class SlideShow {
	
	private int numOfPhotos;
	private ArrayList<Slide> slides;
	private ArrayList<Slide> finalSlides = new ArrayList<>();
	private InterestFactor interestFactor;
	private ArrayList<Slide> bestSlideShow;
	
	public SlideShow(ArrayList<Slide> slides) {
		this.slides = slides;
<<<<<<< HEAD
=======
	}
	
	
	public void addPhoto(Photo photo) {
		
	}
	
	private void createSlideShow() {
		Slide currentSlide = slides.get(0);
		Slide newSlide;
		int currentInterestFactor = 0;
>>>>>>> origin/master
		finalSlides.add(slides.get(0));
		createSlideShow();
		bestSlideShow.addAll(finalSlides);
		int score = calcScore(bestSlideShow);
		for(int i=1;i<slides.size();i++) {
			finalSlides.clear();
			finalSlides.add(slides.get(i));
			createSlideShow();
			if(calcScore(finalSlides) > score){
				bestSlideShow.clear();
				bestSlideShow.addAll(finalSlides);
				score = calcScore(bestSlideShow);
			};
		}
	}
	
	
//	public void addPhoto(Photo photo) {
//		photos.add(photo);
//	}
//	
//	private void createSlideShow() {
//		Slide currentSlide = slides.get(0);
//		Slide newSlide;
//		int currentInterestFactor = 0;
//		finalSlides.add(slides.get(0));
//		boolean canContinue = true;
//		
//		while(canContinue) {
//			for(Slide s : slides) {
//				if(!finalSlides.contains(s)) {
//					interestFactor = new InterestFactor(currentSlide, s);
//					if(interestFactor.getInterestFactor() > currentInterestFactor) {
//						newSlide = s;
//						currentInterestFactor = interestFactor.getInterestFactor();
//					}
//				}
//			}
//		}
//		
//	}
//	
//	
//	private Slide root = slides.get(0);
//	private Slide current = slides.get(0);
//	
//	private void setSlides(Slide current, Slide newSlide) {
//		
//	}
//	
//	private Slide getBestSlide(Slide a, Slide b) {
//		Slide newSlide;
//		int currentInterestFactor = 0;		
//		for(Slide s : slides) {
//			if(!finalSlides.contains(s)) {
//				interestFactor = new InterestFactor(current, s);
//				if(interestFactor.getInterestFactor() > currentInterestFactor) {
//					newSlide = s;
//					currentInterestFactor = interestFactor.getInterestFactor();
//				}
//			}
//		}
//		return newSlide;
//	}
	
	private void createSlideShow() {
		while(finalSlides.size() < slides.size()) {
			addNext();
		}
	}
	
<<<<<<< HEAD
	private void addNext() {
		Slide next = new Slide(new ArrayList<Photo>());
		int score = 0;
		boolean endPosition = true;
		for(int i=0;i<slides.size();i++) {
			if(!finalSlides.contains(slides.get(i))) {
				InterestFactor if1 = new InterestFactor(slides.get(i), finalSlides.get(0));
				InterestFactor if2 = new InterestFactor(slides.get(i), finalSlides.get(finalSlides.size()-1));
				if(if1.getInterestFactor() > score) {
					score = if1.getInterestFactor();
					next = slides.get(i);
					endPosition = false;
				}
				if (if2.getInterestFactor() > score){
					score = if2.getInterestFactor();
					next = slides.get(i);
					endPosition = true;
=======
	private Slide getBestSlide(Slide a, Slide b) {
		Slide newSlide = null;
		int currentInterestFactor = 0;		
		for(Slide s : slides) {
			if(!finalSlides.contains(s)) {
				interestFactor = new InterestFactor(current, s);
				if(interestFactor.getInterestFactor() > currentInterestFactor) {
					newSlide = s;
					currentInterestFactor = interestFactor.getInterestFactor();
>>>>>>> origin/master
				}
			}
		}
		if(endPosition) {
			finalSlides.add(next);
		} else {
			finalSlides.add(0, next);
		}
	}
	
	private int calcScore(ArrayList<Slide> slideShow) {
		int score = 0;
		for(int i=0;i<slideShow.size()-1;i++) {
			interestFactor = new InterestFactor(slideShow.get(i), slideShow.get(i+1));
			score += interestFactor.getInterestFactor();
		}
		return score;
	}
	
}
