import java.util.HashSet;

public class Facade {
    private DocumentoController documentoController;
    public Facade() {
        this.documentoController = new DocumentoController();
    }

    public boolean criarDocumento(String titulo) {
        // Caso o título já esteja cadastrado o método retorna apenas "false".

        boolean criacaoDocumento = documentoController.criaDocumento(titulo);
        return criacaoDocumento;

        // // exemplo de chamada a ser implementado:
        //  return this.documentoController.criarDocumento(titulo);
    }

    public boolean criarDocumento(String titulo, int tamanhoMaximo) {
        // Caso o título já esteja cadastrado o método retorna apenas "false".

        boolean criacaoDocumento = documentoController.criaDocumento(titulo, tamanhoMaximo);
        return criacaoDocumento;

        // // exemplo de chamada a ser implementado:
        //  return this.documentoController.criarDocumento(titulo);
    }

    //ver se é correto ter esse método na facade
    public void removerDocumento(String titulo){
        documentoController.removeDocumento(titulo);
    }

    public int contarElementos(String titulo){}

    public String[] exibirDocumento(String titulo){}

    /*
    É possível também remover um documento do sistema a partir de seu título. Além disso, deve ser possível retornar
    o número de elementos cadastrados em um documento. Para essa operação, o número retornado inicialmente é 0.
     */



}
