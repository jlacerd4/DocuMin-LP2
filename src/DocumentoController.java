import javax.print.attribute.standard.DocumentName;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class DocumentoController {

    private static HashSet<Documento> documentos = new HashSet<>();
    /*
    -criar elemento: cria o elemento na posição imediatamente depois do último elemento criado. Retorna a posição do elemento. A primeira posição de um elemento é zero.
    -mover elemento uma posição acima: troca a posição do elemento com a do elemento imediatamente vizinho mais próximo do início do documento. Caso o documento esteja na primeira posição, ele não é afetado.
    -mover elemento uma posição abaixo: troca a posição do elemento com a do elemento imediatamente vizinho mais próximo do final do documento. Caso o documento esteja no final do documento, ele não é afetado.
    -apagar elemento do documento: remove o elemento do documento. não existe 'posição vazia' entre elementos, mesmo após a remoção.
     */

    public boolean criaDocumento(String titulo) {
        if(testaExistenciaTitulo(titulo) == true) {
            return false;
        }
        testaTituloDocumento(titulo);
        Documento registro = new Documento(titulo);
        documentos.add(registro);
        return true;
    }

    public boolean criaDocumento(String titulo, int tamanho) {
        if(testaExistenciaTitulo(titulo) == true) {
            return false;
        }
        testaTituloDocumento(titulo);
        testaTamanhoDocumento(tamanho);
        Documento registro = new Documento(titulo, tamanho);
        documentos.add(registro);
        return true;
    }

    public static String pegarRepresentacaoCompleta(String tituloDoc, int elementoPosicao){
        for(Documento registro : documentos){
            if(registro.getTitulo().equals(tituloDoc)){
                registro.pegarRepresentacaoCompleta(elementoPosicao);
            }
        }
    }

    private boolean testaExistenciaTitulo(String titulo){
        for(Documento registro : this.documentos){
            if(registro.getTitulo().equals(titulo)){
                return false;
            }
        }
        return true;
    }

    private void testaTituloDocumento(String titulo){
        if(titulo.trim().equals("")){
            throw new IllegalArgumentException("Título vazio.");
        }
    }

    private void testaTamanhoDocumento(int tamanho){
        if(tamanho <= 0){
            throw new IllegalArgumentException("Tamanho menor ou igual a 0.");
        }
    }

    public void removeDocumento(String titulo){
        testaTituloDocumento(titulo);
        boolean elementoRemovido = false;

        for(Documento registro : this.documentos){
            if(registro.getTitulo().equals(titulo)){
                this.documentos.remove(registro);
                elementoRemovido = true;
                break;
            }
        }
        if(elementoRemovido == false){
            throw new NoSuchElementException("Elemento não existe.");
        }
    }

    public static void moverParaCima(String tituloDoc, int elementoPosicao){
        for(Documento registro : documentos){
            if(registro.getTitulo().equals(tituloDoc)){
                registro.moverParaCima(elementoPosicao);
            }
        }
    }

    public static void moverParaBaixo(String tituloDoc, int elementoPosicao){
        for(Documento registro : documentos){
            if(registro.getTitulo().equals(tituloDoc)){
                registro.moverParaBaixo(elementoPosicao);
            }
        }
    }

}