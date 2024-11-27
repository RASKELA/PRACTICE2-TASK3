public abstract class PictureBuilder {
    protected Picture picture;

    public PictureBuilder() {
        picture = new Picture(null, (short) 0, null, null, null, null, null, false, null);
    }

    public abstract PictureBuilder setBasicParams(String name, short year, String author);
    public abstract PictureBuilder setSizeParams(Size size);
    public abstract PictureBuilder setColorParams(String[] colors, boolean isWithFrames, String canvas);
    public abstract PictureBuilder setCategoryParams(String theme, String category);

    public Picture build() {
        return picture;
    }
}