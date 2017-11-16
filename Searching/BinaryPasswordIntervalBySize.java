package Searching;

import Start.Senha;


public final class BinaryPasswordIntervalBySize extends Binary<Senha, Integer> {

    public BinaryPasswordIntervalBySize(Senha[] vector) {
        super(vector);
    }

    public int[] searchInterval(int max, int min){
        int higher = searchBackwards(binarySearch(0, vector.length-1, max));
        int lower = searchForward(binarySearch(0, vector.length-1, min));
        return new int[]{lower, higher};
    }

    private int searchBackwards(int position){
        if(position < 0 || position > this.vector.length-1)
            return -1;
        if(this.vector[position-1].getTamanho() != this.vector[position].getTamanho())
            return position;
        return searchBackwards(position-1);
    }

    private int searchForward(int position){
        if(position > this.vector.length-1 || position < 0)
            return -1;
        if(this.vector[position+1].getTamanho() != this.vector[position].getTamanho())
            return position;
        return searchForward(position+1);
    }

    @Override
    protected boolean equalsTo(Senha x, Integer y) {
        return x.getTamanho() == y;
    }

    @Override
    protected boolean greaterThan(Senha x, Integer y) {
        return x.getTamanho() > y;
    }

    @Override
    protected boolean lowerThan(Senha x, Integer y) {
        return x.getTamanho() < y;
    }
}
