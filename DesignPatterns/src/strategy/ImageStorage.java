package strategy;

public class ImageStorage {
    private Filter currentFilter;
    private Compressor currentCompressor;

    public ImageStorage(Compressor compressor, Filter filter) {
        currentCompressor = compressor;
        currentFilter = filter;
    }

    public void store(){
        currentCompressor.compress();
        currentFilter.filter();
    }

    public Compressor getCompressor() {
        return currentCompressor;
    }

    public void setCompressor(Compressor compressor) {
        currentCompressor = compressor;
    }

    public Filter getFilter() {
        return currentFilter;
    }

    public void setFilter(Filter filter) {
        currentFilter = filter;
    }
}
