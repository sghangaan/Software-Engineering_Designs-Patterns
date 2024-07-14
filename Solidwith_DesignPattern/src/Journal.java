public class Journal implements Resource{
    private int resourceID;
    private String title;
    private String author;

    public Journal(int resourceID, String title, String author) {
        this.resourceID = resourceID;
        this.title = title;
        this.author = author;
    }

    public int getResourceID() {
        return resourceID;
    }

    public void setResourceID(int resourceID) {
        this.resourceID = resourceID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
