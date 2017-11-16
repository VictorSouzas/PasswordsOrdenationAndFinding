package Searching;

public abstract class Binary<T,G> {
    protected T[] vector;
    protected boolean flag;

    public Binary(T[] vector) {
        this.vector = vector;
        this.flag = true;
    }

    protected int binarySearch(int min, int max, G value){
        if(min > max)
            return -1;
        int center = min + (max - min) / 2;
        if(equalsTo(vector[center],value))
            return center;
        if(greaterThan(vector[center], value))
            return binarySearch(center+1, max, value);
        if(lowerThan(vector[center], value))
            return binarySearch(min, center-1, value);
        return -1;
    }

    protected abstract boolean equalsTo(T x, G y);

    protected abstract boolean greaterThan(T x, G y);

    protected abstract boolean lowerThan(T x, G y);

}
