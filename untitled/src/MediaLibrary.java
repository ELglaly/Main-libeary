import java.util.ArrayList;
public class MediaLibrary {

    private ArrayList<Media> mediaCollection;

    public void addMedia(Media media) {
        mediaCollection.add(media);
    }

    public Media getMedia(String title) {
        for (int i = 0; i < mediaCollection.size(); i++) {
            Media media = (Media) mediaCollection.get(i);
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
}
