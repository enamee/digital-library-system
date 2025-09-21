public class RealEBook implements EBook {
    private String title;
    private String author;
    private double size;

    public RealEBook(String name, String author, double n) {
        this.title = name;
        this.author = author;
        size = n;
    }

    public void loadBook() {
        System.out.println("Loading book: " + title + " - " + author);
    }

    public void display() {
        System.out.println(title + " - " + author);
    }

    public String getTitle() {
        return title;
    }
}
