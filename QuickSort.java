public class QuickSort {
    Senha[] vector;
    public QuickSort(Senha[] vector){
        this.vector = vector;
    }

    public Senha[] getVector() {
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
        Senha pivot = this.vector[max];
        int wall = min-1;
        for (int i = min; i <= max-1; i++){
            if(this.vector[i].getFrequencia() >= pivot.getFrequencia()){
                wall++;
                swap(wall,i);
            }
        }
        swap(wall + 1, max);
        return wall+1;
    }

    private void swap(int wall, int i) {
        Senha aux = this.vector[wall];
        this.vector[wall] = this.vector[i];
        this.vector[i] = aux;

    }
}
