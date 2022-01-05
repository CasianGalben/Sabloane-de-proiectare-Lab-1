import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim = new Dimension(400,400);

    private ImageLoader Loader;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();

    public Image(String imageName) {
        this.imageName = imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e) { e.printStackTrace(); }
    }

    public ImageLoaderFactory getImageLoaderFactory() {
        return imageLoaderFactory;
    }

    public void setImageLoaderFactory(ImageLoaderFactory imageLoaderFactory) {
        this.imageLoaderFactory = imageLoaderFactory;
    }

    public ImageLoader getLoader() {
        return Loader;
    }

    public void setLoader(ImageLoader loader) {
        this.Loader = loader;
    }

    public Image(Image image) {
        this.imageName = image.imageName;
    }

    public void loadContent() throws Exception {
        setLoader(ImageLoaderFactory.create(imageName));
    }

    public void print() {
        System.out.println(this.imageName);
    }

    @Override
    public void add(Element element) {
        
    }

    @Override
    public void remove(Element element) {
        
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }

    public char[] getImageName() {
        return null;
    }
}