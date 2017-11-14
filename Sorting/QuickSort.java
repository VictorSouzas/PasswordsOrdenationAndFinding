package Sorting;

public abstract class QuickSort<T> {
    T[] vector;
    public QuickSort(T[] vector){
        this.vector = vector;
    }

    public T[] getVector() {
        sort(0, vector.length-1);
        return vector;
    }

    private void sort(int min, int max){
        if(min < max){
            int patition = partition(min, max);
            sort(min, patition-1);
            sort(patition+1, max);
        }
    }

    private int partition(int min, int max) {
        T pivot = this.vector[max];
        int wall = min-1;
        for (int i = min; i <= max-1; i++){
            if(this.greaterOrEqualThan(this.vector[i], pivot)){
                wall++;
                swap(wall,i);
            }
        }
        swap(wall + 1, max);
        return wall+1;
    }


    public abstract boolean greaterOrEqualThan(T x, T y);


    private void swap(int wall, int i) {
        T aux = this.vector[wall];
        this.vector[wall] = this.vector[i];
        this.vector[i] = aux;

    }
}
