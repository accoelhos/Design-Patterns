// Código cliente
public class Cliente {
    public static void main(String[] args) {
        // Criando os serviços de pagamento
        PagamentoCartaoCredito pagamentoCartao = new PagamentoCartaoCredito();
        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        
        // Usando os adaptadores para interagir com os serviços
        Pagamento pagamentoViaCartao = new AdaptadorPagamentoCartaoCredito(pagamentoCartao);
        Pagamento pagamentoViaBoleto = new AdaptadorPagamentoBoleto(pagamentoBoleto);

        // Cliente processa pagamentos através da interface comum
        pagamentoViaCartao.processarPagamento(100.0);  // Pagamento via Cartão
        pagamentoViaBoleto.processarPagamento(200.0);  // Pagamento via Boleto
    }
}
