public class DocumentManager {
    private static volatile DocumentManager instance;
    private Book Book;

    private DocumentManager() {}

    public static DocumentManager getInstance(){
        if (instance == null) {
            synchronized (DocumentManager.class) {
                if (instance == null) {
                    instance = new DocumentManager();
                }
            }
        }
        return instance;
    }

    public Book getBook() {
        return Book;
    }

    public void setBook(Book book) {
        this.Book = book;
    }
}
