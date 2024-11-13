// Adaptador para Pagamento com Cartão de Crédito
public class AdaptadorPagamentoCartaoCredito implements Pagamento {
    private PagamentoCartaoCredito pagamentoCartaoCredito;

    public AdaptadorPagamentoCartaoCredito(PagamentoCartaoCredito pagamentoCartaoCredito) {
        this.pagamentoCartaoCredito = pagamentoCartaoCredito;
    }

    @Override
    public void processarPagamento(double valor) {
        pagamentoCartaoCredito.pagarComCartao(valor);  // Adaptando a chamada
    }
}
