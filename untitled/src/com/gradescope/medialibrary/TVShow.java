package com.gradescope.medialibrary;

public class TVShow extends Media{

    public TVShow(String title, Media.Genre genre) {
        this.title = title;
        this.genre = genre;
    }
    @Override
    public MediaType getMediaType() {
        return MediaType.TVSHOW;
    }
}
