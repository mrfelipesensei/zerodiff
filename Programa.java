public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.titular = "Maria";
        c1.depositar(100.0);

        Conta c2 = new Conta();
        c2.titular = "Felipe";
        c2.depositar(50.0);
        
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
