public class PortaFechada implements EstadoPorta{
    //mudando de estado 
    @Override
    public void abrir(Porta porta) {
        System.out.println("Abrindo a porta...");
        porta.setEstadoAtual(new PortaAberta());
    }
    //indo para esse estado
    @Override
    public void fechar(Porta porta) {
        System.out.println("A porta já está fechada.");
    }
    
}
