import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

public class Documento {

    private String titulo;
    private int tamanho; //Ao criar um documento é opcional a passagem de um tamanho. Quando presente,
                         // o tamanho delimita o número de elementos que um documento pode ter e, caso não seja passado,
                         // o documento pode ter uma quantidade ilimitada de elementos.

    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Documento(String titulo){
        if(titulo.trim().equals("")){
            throw new IllegalArgumentException("Título não pode estar vazio.");
        }else{
            this.titulo = titulo;
        }
    }


    public Documento(String titulo, int tamanho){
            this.titulo = titulo;
            this.tamanho = tamanho;
    }

    public int criaElemento(int prioridade, String valor, HashMap<String, String> propriedades){
        Elemento elemento = new Elemento(prioridade, valor, propriedades);
        this.elementos.add(elemento);
        return elementos.indexOf(elemento);
    }


    public void moverParaCima(int indElemento){
        if(indElemento == 0){
            throw new IllegalArgumentException("Elemento no índice 0. Não há elementos mais próximos do início.");
        }else{
            Collections.swap(elementos, indElemento, indElemento-1);
        }
    }

    public String pegarRepresentacaoCompleta(int elementoPosicao){

    }

    public void moverParaBaixo(int indElemento) {
        if(indElemento == elementos.size() - 1){
            throw new IllegalArgumentException( "Elemento no último índice da Lista." +
                                                "Não há elementos mais próximos do final.");
        }else{
            Collections.swap(elementos, indElemento, indElemento+1);
        }
    }

    public int pegaQtdeElementos(){
        return elementos.size();
    }


    /*
    Por fim, um documento pode retornar sua representação em um array de strings que representam seus elementos.
    Cada componente do array é a representação textual do elemento na mesma posição daquele documento. Ainda,
    o array deve ter o mesmo tamanho do número de elementos presentes no documento (independente do seu limite de
    tamanho). Caso o documento não tenha elementos, isto retorna um array vazio.

    @Override
    public String toString(){

    }
    */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Documento documento = (Documento) o;
        return Objects.equals(titulo, documento.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }


    public String getTitulo() {
        return this.titulo;
    }

}
