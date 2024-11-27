public class Main {
    public static void main(String[] args) {
        Size size = new Size();
        size.setHeight((short) 50);
        size.setWidth((short) 40);

        PictureBuilder usaBuilder = new UsaPictureBuilder();
        Picture usaPicture = usaBuilder
                .setBasicParams("Statue of Liberty", (short) 1886, "Frederic Auguste Bartholdi")
                .setSizeParams(size)
                .setColorParams(new String[]{"Green", "Brown"}, true, "Oil")
                .setCategoryParams("Landmark", "Cultural")
                .build();

        System.out.println(usaPicture);

        PictureBuilder ukraineBuilder = new UkrainePictureBuilder();
        Picture ukrainePicture = ukraineBuilder
                .setBasicParams("Sunflower Fields", (short) 2020, "Ukrainian Artist")
                .setSizeParams(size)
                .setColorParams(new String[]{"Yellow", "Blue"}, false, "Acrylic")
                .setCategoryParams("Nature", "National Symbol")
                .build();

        System.out.println(ukrainePicture);
    }
}