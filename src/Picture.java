public class Picture {
    private String name;
    private short year;
    private String author;
    private String theme;
    private String category;
    private String[] colors;
    private Size size;
    private boolean isWithFrames;
    private String canvas;

    public Picture(String name, short year, String author, String theme, String category,
                   String[] colors, Size size, boolean isWithFrames, String canvas) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.theme = theme;
        this.category = category;
        this.colors = colors;
        this.size = size;
        this.isWithFrames = isWithFrames;
        this.canvas = canvas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", theme='" + theme + '\'' +
                ", category='" + category + '\'' +
                ", colors=" + String.join(", ", colors) +
                ", size=" + size.getHeight() + "x" + size.getWidth() +
                ", isWithFrames=" + isWithFrames +
                ", canvas='" + canvas + '\'' +
                '}';
    }
}