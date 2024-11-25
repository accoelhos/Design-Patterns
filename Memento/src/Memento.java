//armazena o estado do texto
public class Memento {

    private String conteudo;
    public Memento(String conteudo){
        this.conteudo = conteudo;
    }
    public String getConteudo(){
        return conteudo;
    }
}
