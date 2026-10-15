public class Conta {
    private String titular; //private - só a própria classe vê, portanto c1.saldo deixaria de funcionar
    private double saldo;

    public Conta(String titular) { // construtor - roda no momento de new Conta
        this.titular = titular; // this - referencia ao próprio objeto
        this.saldo = 0.0;
    }

    public String getTitular() { // getters - só leem
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) { // único jeito de mexer no saldo, e ainda o valida
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito");
            return;
        } else {
            saldo = saldo + valor;
        }
    }



}
