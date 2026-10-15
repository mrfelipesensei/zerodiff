public class Transacao {
    private String data;
    private double valor;
    private String nome;

    public Transacao(String data, double valor, String nome) {
        this.data = data;
        this.valor = valor;
        this.nome = nome;
    }

    public String getData() { return data; }
    public double getValor() { return valor; }
    public String getNome() { return nome; }

    @Override   // Substitui o texto padrão que o Java usa quando imprimos um ojeto
    public String toString() {
        return data + " | " + valor + " | " + nome;
    }

}
