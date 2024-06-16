package strategy;

public class JpegCompressor implements Compressor{

    @Override
    public void compress() {
        System.out.println("JPEG compressor");
    }
}
