import java.util.ArrayList;

public class Chapter {
    private String title;
    private ArrayList<SubChapter> subChapters;

    public Chapter(String title) {
        this.title = title;
        this.subChapters = new ArrayList<SubChapter>(); }

    public int getSubChapter(String subChapter) {
        this.subChapters.add(new SubChapter(subChapter));
        return this.subChapters.size() - 1; }

    public SubChapter getSubChapterByIndex(int Index) {
        return this.subChapters.get(Index); }

    public void print() {
        System.out.println("Capitol" + this.title);

        for (SubChapter i : this.subChapters)
            i.print(); }
}