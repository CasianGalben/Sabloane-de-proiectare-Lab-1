import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Element> elemente;
    private ArrayList<Author> Autor;

    public Book(String title) {
        this.title = title;
        this.elemente = new ArrayList<Element>();
        this.Autor = new ArrayList<Author>();
    }

    public void addContent (Element elemente) {
        this.elemente.add(elemente);
    }

    public void addAuthor (Author Autor) {
        this.Autor.add(Autor);
    }

    public void print() {
        System.out.println("Book: " + this.title);

        System.out.println("Authors: ");
        for (Author i : this.Autor)
            i.print();

        System.out.println("Paragraph: ");
        for (Element i : this.elemente)
            i.print();
    }
}