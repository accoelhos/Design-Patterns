//outro handler concreto
class Gerente extends AprovadorBase {
    @Override
    public void processarPedido(double valor) {
        if (valor <= 1000) {
            System.out.println("Gerente aprovou o reembolso de R$ " + valor);
        } else {
            System.out.println("Gerente não pode aprovar. Encaminhando ao diretor...");
            encaminharParaProximo(valor);
        }
    }
}
