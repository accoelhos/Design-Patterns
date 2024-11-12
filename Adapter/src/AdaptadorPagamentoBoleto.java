// Adaptador para Pagamento com Boleto Bancário
public class AdaptadorPagamentoBoleto implements Pagamento {
    private PagamentoBoleto pagamentoBoleto;

    public AdaptadorPagamentoBoleto(PagamentoBoleto pagamentoBoleto) {
        this.pagamentoBoleto = pagamentoBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        pagamentoBoleto.emitirBoleto(valor);  // Adaptando a chamada
    }
}
