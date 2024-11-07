public class PortaAberta implements EstadoPorta{
    //estado atual
    @Override
    public void abrir(Porta porta) {
        System.out.println("A porta já está aberta.");
        porta.setEstadoAtual(new PortaAberta());
    }
    //mudando de estado
    @Override
    public void fechar(Porta porta) {
        System.out.println("Fechando a porta...");
    }
    
}
