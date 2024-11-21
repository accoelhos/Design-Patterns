//handler concreto
class Funcionario extends AprovadorBase {
    @Override
    public void processarPedido(double valor) {
        if (valor <= 100) {
            System.out.println("Funcionário aprovou o reembolso de R$ " + valor);
        } else {
            System.out.println("Funcionário não pode aprovar. Encaminhando ao gerente...");
            encaminharParaProximo(valor);
        }
    }
}
