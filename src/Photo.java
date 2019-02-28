
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sento
 */
public class Photo {
    
    private String photoID;
    private String orientation;
    private int numOfTags;
    private ArrayList<String> tags;
    private ArrayList<String> photoInformation;
    
    public Photo(ArrayList<String> photoInformation){
        this.photoInformation = photoInformation;
        setInformation();
    }
    
    
    private void setInformation(){
        photoID = photoInformation.get(0);
        orientation = photoInformation.get(1);
        numOfTags = Integer.parseInt(photoInformation.get(2));
        for(int i = 3; i < photoInformation.size(); i++){
            tags.add(photoInformation.get(i));
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

