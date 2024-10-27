package com.gradescope.medialibrary;

public class Movie extends Media {
    public Movie(String title, Media.Genre genre) {
        this.title = title;
        this.genre = genre;
    }



    @Override
    public MediaType getMediaType() {
        return MediaType.MOVIE;
    }
}
