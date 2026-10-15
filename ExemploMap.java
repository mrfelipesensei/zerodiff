import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> precos = new HashMap<>();   //Um mapa onde a chave é String e o valor é Double

        precos.put("café", 15.0);   // guarda o valor 15.0 sob a chave "café"
        precos.put("pão", 8.5);
        precos.put("leite", 5.0);

        System.out.println(precos.get("café")); // busca pelo valor da chave. Devolve 15.0
        System.out.println(precos.get("pão"));
        System.out.println(precos.get("chocolate"));    // a chave não existe - Map devolve null
    }
    
}