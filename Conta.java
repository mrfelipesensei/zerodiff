public class Conta {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    void mostrarSaldo() {
        System.out.println(titular + " tem R$ " + saldo);
    }
}
