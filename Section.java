import java.util.ArrayList;

public class Section implements Element {
    private String title;
    private ArrayList<Element> elemente;

    public Section(String title) {
        this.title = title;
        this.elemente = new ArrayList<Element>();
    }

    @Override
    public void add(Element element) throws Exception {
        for (Element i : this.elemente)
            if (i.find(element))
                throw new Exception("Fail");

        this.elemente.add(element);
    }

    @Override
    public void remove(Element element) {
        this.elemente.remove(element);
    }

    @Override
    public boolean find(Element element) {
        for (Element i : this.elemente) {
            if (i.find(element))
                return true;
        }

        return false;
    }

    public void print() {
        System.out.println(this.title);

        for (Element i : this.elemente)
            i.print();
    }
}