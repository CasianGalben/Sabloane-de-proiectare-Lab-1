
public class BookStatistics implements Visitor {
    private Object alignStrategy;

    @Override
    public void visitBook(Book book) {
        System.out.println("Carte: " + book.getTitle());

        System.out.println("Autori: ");
        for (Author i : book.getAuthors())
            i.print();

        System.out.println("Elemente: ");
        for (Element i : book.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }

    @Override
    public void visitSection(Section section) {
        System.out.println("Titlu: " + section.getTitle());

        for (Element i : section.getElements()) {
            Visitee castedI = (Visitee) i;
            castedI.accept(this);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {
        System.out.println("Cuprins");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        if (paragraph.getAlignStrategy() == null) {
            alignStrategy = paragraph.getAlignStrategy();
            alignStrategy.render(paragraph, null);
        }
        else
            System.out.println("models.Paragraph" + paragraph.getText());
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        System.out.println("models.Image proxy with url:" + imageProxy.getUrl() + " and dimension:" + imageProxy.dim());

        Image localImage = imageProxy.loadImage();
        visitImage(localImage);
    }

    @Override
    public void visitImage(Image image) {
        System.out.println(image.getImageName());
    }

    @Override
    public void visitTable(Table table) {
        System.out.println(table.getTitle());
    }

    public void printStatistics() {
    }
}
