import java.util.ArrayList;
import java.util.Collections;

public class Section implements Element {
    private String title;
    private ArrayList<Element> elemente;

    public Section(String title) {
        this.title = title;
        this.elemente = new ArrayList<Element>();
    }

    public Section(Section section) {
        this.title = section.title;
        this.elemente = new ArrayList<>();
        Collections.copy(this.elemente, section.elemente);
    }

    @Override
    public void add(Element elementToBeAdded) throws Exception {
        Element element = Utils.checkAndReturnCopy(elementToBeAdded);
        this.elemente.add(element);
    }

    public void addWithoutCopy(Element elementToBeAdded) throws Exception {
        this.elemente.add(elementToBeAdded);
    }

    @Override
    public void remove(Element element) {
        this.elemente.remove(element);
    }

    public void print() {
        System.out.println("Titlu: " + this.title);

        for (Element i : this.elemente)
            i.print();
    }

    public void accept(BookStatistics stats) {
    }

    public String getTitle() {
        return null;
    }

    public Element[] getElements() {
        return null;
    }
}