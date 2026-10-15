import java.io.BufferedReader; // leitor que lê pedaços e mantém um buffer
import java.io.FileReader;     // abre o arquivo
import java.io.IOException;


public class LeitorArquivo {
    public static void main(String[] args) {
        try (BufferedReader leitor = new BufferedReader(new FileReader("extrato.txt", java.nio.charset.StandardCharsets.UTF_8))) {
            String linha;
            while ((linha = leitor.readLine()) != null) { // sintaxe a primeira vista estranha, mas faz duas coisas ao mesmo tempo - atribui resultado de readLine() à variável linha e comprara com null
                System.out.println("Li: " + linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
