public class Documento {

    private String titulo;
    private int tamanho; //Ao criar um documento é opcional a passagem de um tamanho. Quando presente,
                         // o tamanho delimita o número de elementos que um documento pode ter e, caso não seja passado,
                         // o documento pode ter uma quantidade ilimitada de elementos.

    public Documento(String titulo){
        this.titulo = titulo;
    }

    public Documento(String titulo, int tamanho){
        this.titulo = titulo;
        this.tamanho = tamanho;
    }

}
