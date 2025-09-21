public class REBook implements EBook {
    private String title;
    private String author;
    private double size;
    private boolean isBookDisplayed;

    public REBook(String name, String author, double n) {
        this.title = name;
        this.author = author;
        size = n;
        isBookDisplayed = false;
    }

    public void loadBook() {
        if (isBookDisplayed == false) {
            System.out.println("Displaying book for the first time.");
            display();
        }
        System.out.println("Loading book: " + title + " - " + author);
    }

    public void display() {
        isBookDisplayed = true;
        System.out.println(title + " - " + author);
    }
}