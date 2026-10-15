public class Programa {
    public static void main(String[] args) {
        Conta c1 = new Conta("Maria");
        c1.depositar(100.0);

        Conta c2 = new Conta("Felipe");
        c2.depositar(50.0);
        
        System.out.println(c1.getTitular() + " tem R$ " + c1.getSaldo());
        System.out.println(c2.getTitular() + " tem R$ " + c2.getSaldo());
    }
}
