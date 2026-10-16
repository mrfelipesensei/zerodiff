import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Leitor {
    public static List<Transacao> ler(String nomeArquivo) { //recebe o nome do arquivo, devolve uma lista
        List<Transacao> transacoes = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(    //é uma peça, não tem ponto de entrada
                new FileReader(nomeArquivo, StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                try {
                    String[] campos = linha.split(";");
                    String data = campos[0];
                    double valor = Double.parseDouble(campos[1]);
                    String nome = campos[2];
                    transacoes.add(new Transacao(data, valor, nome));
                } catch (Exception e) {
                    System.out.println("Linha ignorada: " + linha + " (" + e.getMessage() + ")");
                }
            }
    
        } catch (Exception e) {
            System.out.println("Erro ao abrir arquivo: " + e.getMessage());
        }

        return transacoes;  // devolve a lista montada
    }
}