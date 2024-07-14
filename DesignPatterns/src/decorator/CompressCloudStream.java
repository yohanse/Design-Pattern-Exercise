package decorator;

public class CompressCloudStream implements Stream {
    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressData = compress(data);
        stream.write(compressData);
    }

    private String compress(String data){
        return "Compressed Data: " + data;
    }
    

}
