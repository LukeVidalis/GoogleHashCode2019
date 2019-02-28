import java.util.ArrayList;

public class Slide {
	private ArrayList<Photo> photos = new ArrayList<Photo>();
	private ArrayList<String> tags = new ArrayList<String>();

	public Slide(ArrayList<Photo> photos) {
		this.photos = photos;
		setupTags();
	}

	private void setupTags() {
		if (photos.size() == 1) {
			tags = photos.get(0).getTags();
		} else {
			ArrayList<String> tagsA= photos.get(0).getTags();
			ArrayList<String> tagsB= photos.get(1).getTags();
			ArrayList<String> commonTags = new ArrayList<String>(tagsA);
			commonTags.retainAll(tagsB);
			tags=commonTags;
		}
	}

	public ArrayList<Photo> getPhotos() {
		return photos;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < photos.size(); i++) {
			if (i > 0) {
				s = s + " ";
			}
			s = s + photos.get(i).getPhotoID();
		}
		return s;
	}

}
