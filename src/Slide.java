import java.util.ArrayList;

public class Slide {
	private ArrayList<Photo> photos = new ArrayList<Photo>();
	private ArrayList<String> tags = new ArrayList<String>();
	

	public Slide(ArrayList<Photo> photos) {
		this.photos = photos;
		setupTags();
	}
	
	private void setupTags() {
		if(photos.size()==1) {
			
		}
	}

	public String toString() {
		String s="";
		for(int i=0;i<photos.size();i++) {
			if(i>0) {
				s=s+" ";
			}
			s=s+photos.get(i).getPhotoID();
		}
		return s;
	}
	
}
