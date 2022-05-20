package _02_structural_patterns._12_proxy._04_myexam;

public class Proxy_Image implements Image{

    private Real_Image real_image;
    private String fileName;

    public Proxy_Image(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (real_image == null) {
            real_image = new Real_Image(fileName);
        }
        real_image.displayImage();
    }
}
