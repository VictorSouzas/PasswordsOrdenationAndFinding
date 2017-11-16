package Sorting;

import Start.Senha;

public final class QuickByPasswordSize extends QuickSort<Senha> {
    public QuickByPasswordSize(Senha[] vector) {
        super(vector);
    }

    @Override
    protected boolean greaterOrEqualThan(Senha x, Senha y) {
        return x.getTamanho() >= y.getTamanho();
    }
}
