//cliente
public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();

        // Porta começa fechada
        porta.abrir();    // Abrindo a porta
        porta.abrir();    // A porta já está aberta
        porta.fechar();   // Fechando a porta
        porta.fechar();   // A porta já está fechada
    }
}
