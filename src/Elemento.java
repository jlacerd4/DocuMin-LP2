import java.util.HashMap;

public class Elemento {

    private int prioridade;
    private String valor;
    private HashMap<String, String> propriedades = new HashMap<>();


    public Elemento(int prioridade, String valor, HashMap<String, String> propriedades){
        this.prioridade = prioridade;
        this.valor = valor;
        this.propriedades = propriedades;
    }

    /*
    Além disso, é possível executar as seguintes operações em cada elemento:
        - gerar representação completa: retorna uma string que representa a visão completa de um elemento
        - gerar representação resumida: retorna uma string com uma representação resumida de um elemento
     */

    /*

     */

}
