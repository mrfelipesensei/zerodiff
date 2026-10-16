import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conciliador {
    public static void main(String[] args) {
        List<Transacao> extrato = Leitor.ler("extrato.txt");
        List<Transacao> interno = Leitor.ler("interno.txt");

        Map<String, Transacao> mapaExtrato = paraMapa(extrato); //paraMapa é um método nosso - recebe uma lista, percorre com for-each e usa t.chave como chave do mapa
        Map<String, Transacao> mapaInterno = paraMapa(interno);

        System.out.println("Extrato: " + mapaExtrato.size() + " transações");
        System.out.println("Interno: " + mapaInterno.size() + " transações");
    }

    static Map<String, Transacao> paraMapa(List<Transacao> lista) {
        Map<String, Transacao> mapa = new HashMap<>();
        for (Transacao t : lista) {
            mapa.put(t.chave(), t);
        }
        return mapa;
    }
}