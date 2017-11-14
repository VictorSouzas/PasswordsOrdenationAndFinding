package Start;

import Sorting.QuickSort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class Principal {

    public static void main(String[] args) {
        JFileChooser abrir = new JFileChooser();
        int retorno = abrir.showOpenDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            String caminho = abrir.getSelectedFile().getAbsolutePath();
            Senha[] senhas = leArquivo(caminho);
            System.out.println("Arquivo lido com sucesso");
            QuickSort quick = new QuickSort(senhas);
            senhas = quick.getVector();
            for (int i = 0; i < senhas.length; i++){
                System.out.println(senhas[i].getFrequencia());
            }
            
        } else { //Caso não seja selecionado um arquivo
            System.out.println("É necessário escolher o arquivo");
        }
    }

    private static Senha[] leArquivo(String nome) {
        Senha[] senhas = new Senha[430000];
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            int cont = 0;
            String linha = lerArq.readLine();
            while (linha != null) {
                String[] partes = linha.split(" ");
                int tamanho = Integer.parseInt(partes[0]);
                int frequencia = Integer.parseInt(partes[1]);
                String palavra = "";
                for (int i = 2; i < partes.length; i++) {
                    if (i == 2) {
                        palavra = palavra + partes[i];
                    } else {
                        palavra = palavra + " " + partes[i];
                    }
                }
                Senha senha = new Senha(tamanho, frequencia, palavra);
                senhas[cont] = senha;
                linha = lerArq.readLine();
                cont++;
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        return senhas;
    }
}
