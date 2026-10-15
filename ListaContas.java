import java.util.ArrayList; // importação de bibliotecas
import java.util.List;

public class ListaContas {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>(); // uma lista de Conta. O <Conta> é o genérico - essa lista só aceita objetos do tipo Conta
                                                // new ArrayList<> é a implementação concreta - List é a interface, ArrayList é a classe real
        contas.add(new Conta("Maria"));
        contas.add(new Conta("Henrique"));
        contas.add(new Conta("Serena"));

        for (Conta c : contas) { // para cada Conta chamada c dentro de Contas
            System.out.println(c.getTitular() + " - saldo: " + c.getSaldo());
        }
    }
}
