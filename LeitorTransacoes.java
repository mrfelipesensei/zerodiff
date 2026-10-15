import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;


public class LeitorTransacoes {
    public static void main(String[] args) {
        List<Transacao> transacoes = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(
            new FileReader("extrato.txt", StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                try {
                    String[] campos = linha.split(";");
                    String data = campos[0];
                    double valor = Double.parseDouble(campos[1]);                    
                    String nome = campos[2];
                    transacoes.add(new Transacao(data, valor, nome));
                } catch (Exception e) {
                    System.out.println("Linha ignorada: " + linha + " (" + e.getLocalizedMessage() + ") ");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        for (Transacao t : transacoes) {
            System.out.println(t);
        }
    }
}