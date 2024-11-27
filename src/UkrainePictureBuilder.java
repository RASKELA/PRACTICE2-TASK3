public class UkrainePictureBuilder extends PictureBuilder {

    @Override
    public PictureBuilder setBasicParams(String name, short year, String author) {
        picture.setName(name);
        picture.setYear(year);
        picture.setName(author);
        return this;
    }

    @Override
    public PictureBuilder setSizeParams(Size size) {
        picture.size = size;
        return this;
    }

    @Override
    public PictureBuilder setColorParams(String[] colors, boolean isWithFrames, String canvas) {
        picture.colors = colors;
        picture.isWithFrames = isWithFrames;
        picture.canvas = canvas;
        return this;
    }

    @Override
    public PictureBuilder setCategoryParams(String theme, String category) {
        picture.theme = theme;
        picture.category = category;
        return this;
    }
}