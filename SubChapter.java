import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elemente;

    public SubChapter(String name) {
        this.name = name;
        this.elemente = new ArrayList<Element>();
    }

    public void addElement (Element Element) {
        this.elemente.add(Element);
    }

    public void print() {
        System.out.println("Subcapitol " + this.name);

        for (Element i : this.elemente)
            i.print();
    }
}