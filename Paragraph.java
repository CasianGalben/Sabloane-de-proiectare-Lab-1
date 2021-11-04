public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph:"+this.text);
    }

    @Override
    public void add(Element element) {
        
    }

    @Override
    public void remove(Element element) {
        
    }

    @Override
    public boolean find(Element element) {
        if (!(element instanceof Paragraph))
            return false;
        else {
            return ((Paragraph) element).text.equals(this.text);
        }
    }
}