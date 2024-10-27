package com.gradescope.medialibrary;

import java.util.ArrayList;

public class MediaLibrary {

    private ArrayList<Media> mediaCollection = new ArrayList<Media>(); // Initializes an ArrayList to hold Media objects


    // Defines a method to add a Media object to the collection
    public void addMedia(Media media) {
        mediaCollection.add(media); // Adds the Media object to the mediaCollection list
    }

    // Defines a method to find and return a Media object by its title
    public Media getMedia(String title) {
        // Loops through each Media object in mediaCollection
        for (int i = 0; i < mediaCollection.size(); i++) {
            Media media = mediaCollection.get(i);
            // Checks if the Media object's title matches the given title
            if (media.getTitle().equals(title)) {
                return media; // Returns the Media object
            }
        }
        return null;
    }
   // Defines a method to return a string representation of the MediaLibrary
    public String toString() {
        String result = "";
        // Defines a method to return a string representation of the MediaLibrary
        for (int i = 0; i < mediaCollection.size(); i++) {
            Media media = mediaCollection.get(i); // get the Media object
            result += media.toString(); // Appends the Media object's string
            if(i < mediaCollection.size()-1) // Checks if this is not the last Media object in the list
                result += "\n"; // Adds a newline character
        }
        return result;
    }
}
