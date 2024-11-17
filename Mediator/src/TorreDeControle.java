//mediador concreto
class TorreDeControle implements Mediador {
    private Aviao aviao1;
    private Aviao aviao2;

    public void registrarAvioes(Aviao aviao1, Aviao aviao2) {
        this.aviao1 = aviao1;
        this.aviao2 = aviao2;
    }
    @Override
    public void notificar(String origem, String mensagem) {
        if (origem.equals("Aviao 1")) {
            aviao2.receberMsg("de Aviao 1: " + mensagem);
        } else {
            aviao1.receberMsg("de Aviao 2: " + mensagem);
        }
    }
}
