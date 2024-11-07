//contexto
public class Porta {
    private EstadoPorta estadoAtual;

    public Porta() {
        // A porta começa no estado "fechada"
        this.estadoAtual = new PortaFechada();
    }

    public void setEstadoAtual(EstadoPorta novoEstado) {
        this.estadoAtual = novoEstado;
    }

    public void abrir() {
        estadoAtual.abrir(this);
    }

    public void fechar() {
        estadoAtual.fechar(this);
    }
}
