package Sorting;
import Start.Senha;
public final class QuickByPasswordFrequency extends QuickSort<Senha> {
    public QuickByPasswordFrequency(Senha[] vector) {
        super(vector);
    }

    @Override
    protected boolean greaterOrEqualThan(Senha x, Senha y) {
        return x.getFrequencia() >= y.getFrequencia();
    }

}
