package nextgenapps.customlistviewsample;

/**
 * Created by apple on 30/01/17.
 */

public class Apps {

    private String name;
    private String description;
    private int imageID;

    public Apps(String name, String description, int imageID) {

        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }
}
