import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Chapter> Capitole;
    private ArrayList<Author> Autor;
    private TableOfContents TableOfContents;

    public Book(String title) {
        this.Autor = new ArrayList<Author>();
        this.TableOfContents = new TableOfContents();
        this.title = title;
        this.Capitole = new ArrayList<Chapter>();
       
    }
    public Chapter getChapter(int index) {
        return this.Capitole.get(index);
    }
    

    public int createChapter (String Capitol) {
        this.Capitole.add(new Chapter(Capitol));

        return this.Capitole.size() - 1;
    }

  
    public void addAuthor (Author autor) {
        this.Autor.add(autor);
    }

    public void print() {
        System.out.println("Book" + this.title);
        this.TableOfContents.print();

        System.out.println("Author: ");
        for (Author i : this.Autor)
            i.print();

        for (Chapter i : this.Capitole)
            i.print();
    }
}