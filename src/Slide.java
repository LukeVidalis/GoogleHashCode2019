import java.util.ArrayList;

public class Slide {
	private ArrayList<Photo> photos = new ArrayList<Photo>();

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(ArrayList<Photo> photos) {
		this.photos = photos;
	}

	public Slide() {

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
