

import java.util.ArrayList;


public class Photo {
    
    private String photoID;
    private String orientation;
    private int numOfTags;
    private ArrayList<String> tags = new ArrayList<String>();
    
    public Photo(String photoInformation){
        setInformation(photoInformation);
    }
    
    
    private void setInformation(String photoInformation){
    	String[] info = photoInformation.split(" ");
        photoID = info[0];
        orientation = info[1];
        numOfTags = Integer.parseInt(info[2]);
        for(int i = 3; i < info.length; i++){
            tags.add(info[i]);
        }
    }
       

    public String getPhotoID() {
        return photoID;
    }

    public String getOrientation() {
        return orientation;
    }

    public int getNumOfTags() {
        return numOfTags;
    }

    public ArrayList<String> getTags(){
        return tags;
    }
    
    public String getTag(int index){
        return tags.get(index);
    }

    public void setPhotoID(String photoID) {
        this.photoID = photoID;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public void setNumOfTags(int numOfTags) {
        this.numOfTags = numOfTags;
    }
   

}

