public class Main {
    public static void main(String[] args) {
        RealEBook ebook = new RealEBook("Java", "XYZ", 2.6);
        REBook ebook2 = new REBook("Python", "ABC", 5.1);

        ebook2.loadBook(); // first time loading
        System.out.println("");
        ebook2.loadBook(); // second time loading
    }
}
