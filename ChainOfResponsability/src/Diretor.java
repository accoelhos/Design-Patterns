//ultimo handler da corrente
class Diretor extends AprovadorBase {
    @Override
    public void processarPedido(double valor) {
        if (valor <= 10000) {
            System.out.println("Diretor aprovou o reembolso de R$ " + valor);
        } else {
            System.out.println("Diretor não pode aprovar o reembolso de R$ " + valor);
        }
    }
}

