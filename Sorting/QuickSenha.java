package Sorting;
import Start.Senha;
public final class QuickSenha extends QuickSort<Senha> {
    public QuickSenha(Senha[] vector) {
        super(vector);
    }

    @Override
    protected boolean greaterOrEqualThan(Senha x, Senha y) {
        return x.getFrequencia() >= y.getFrequencia();
    }

}
