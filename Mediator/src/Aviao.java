//componente
public class Aviao {
    private String nome;
    private Mediador mediador;

    public Aviao(String nome, Mediador mediador){
        this.nome = nome;
        this.mediador = mediador;
    }
    public void enviarMsg(String msg){
        System.out.println(nome+" enviou a mensagem "+msg);
        mediador.notificar(nome, msg);
    }
    public void receberMsg(String msg){
        System.out.println(nome+" recebeu a mensagem "+msg);
    }
}
