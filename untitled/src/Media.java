public class Media {

  protected String title;
  protected enum Genre {    };
  protected Genre genre;
  protected  enum MediaType{ };
  protected MediaType type;

    public String getTitle() {
        return title;
    }
    public MediaType getMediaType() {
        return type;
    }
    public String toString() {
        return title;
    }
}
