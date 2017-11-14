package main;

public class Senha {

    private int tamanho;
    private int frequencia;
    private String palavra;

    public Senha(int tamanho, int frequencia, String palavra) {
        this.tamanho = tamanho;
        this.frequencia = frequencia;
        this.palavra = palavra;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public String getPalavra() {
        return palavra;
    }
}


