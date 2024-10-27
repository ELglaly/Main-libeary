package org.example.com.gradescope.medialibrary;

public abstract class Media {

  protected String title;
  protected enum Genre {  HORROR, SCIFI , DRAMA, COMEDY  };
  protected Genre genre;
  protected  enum MediaType{ MOVIE, TVSHOW };
  protected MediaType type;

    public String getTitle() {
        return title;
    }
    public abstract MediaType getMediaType() ;
    public String toString() {
        MediaType thisType = getMediaType();
        switch (thisType) {
            case MOVIE:
                return "Movie title: " + getTitle();
            case TVSHOW:
                return "Show title: " + getTitle();
            default:
                return null;
        }
    }
}
