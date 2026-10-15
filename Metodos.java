public class Metodos {
    public static void main(String[] args) {
        saudacao("Maria");
        saudacao("Felipe");

        int resultado = soma(3, 4);
        System.out.println("Resultado: " + resultado);
    }

    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    static  int soma(int a, int b) {
        return a + b;
    }
}
