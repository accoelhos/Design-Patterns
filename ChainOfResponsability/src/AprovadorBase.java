//Handler Base
abstract class AprovadorBase implements ReembolsoHandler {
    private ReembolsoHandler proximo;

    @Override
    public void setProximo(ReembolsoHandler handler) {
        this.proximo = handler;
    }

    protected void encaminharParaProximo(double valor) {
        if (proximo != null) {
            proximo.processarPedido(valor);
        } else {
            System.out.println("Reembolso não pode ser aprovado.");
        }
    }
}
