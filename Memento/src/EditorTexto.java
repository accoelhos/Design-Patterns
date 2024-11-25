//originator
public class EditorTexto {
    private String conteudo = "";
    public void type(String palavras){
        conteudo+=palavras;
    }
    public String getConteudo(){
        return conteudo;
    }
    //salvando o estado atual em um memento
    public Memento save(){
        return new Memento(conteudo);
    }
    //restaurando com memento
    public void restaurar(Memento m){
        this.conteudo = m.getConteudo();
    }

    
}
