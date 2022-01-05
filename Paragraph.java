public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public Paragraph(Paragraph paragraph) {
        this.text = paragraph.text;
    }

    public void print() {
        if (this.alignStrategy != null) {
            this.alignStrategy.render(this, null);
        }
        else
            System.out.println("Paragraph" + this.text);
    }

    @Override
    public void add(Element element) {
        
    }

    @Override
    public void remove(Element element) {
        
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.alignStrategy = align;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    public String getText() {
        return null;
    }
}