public class JPGImageLoader implements ImageLoader{
    private String imageName;
    public JPGImageLoader(String imageName) {
        this.setImageName(imageName);
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded JPG Image: " + str);
    }
}