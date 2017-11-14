package Sorting;
import Start.Senha;
public class QuickSenha extends QuickSort<Senha> {
    public QuickSenha(Senha[] vector) {
        super(vector);
    }

    @Override
    public boolean greaterOrEqualThan(Senha x, Senha y) {
        return x.getFrequencia() >= y.getFrequencia();
    }

}
