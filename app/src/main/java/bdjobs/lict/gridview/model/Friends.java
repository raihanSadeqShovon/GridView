package bdjobs.lict.gridview.model;

public class Friends {

    private int imageId;
    private String name;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friends(int imageId, String name) {
        this.imageId = imageId;
        this.name = name;


    }
}
