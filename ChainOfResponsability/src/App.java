//cliente
public class App {
    public static void main(String[] args) {
        //criação dos handlers
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        //configuração da corrente - funcionario -> gerente -> diretor
        funcionario.setProximo(gerente);
        gerente.setProximo(diretor);

        //teste de pedidos
        double[] pedidos = {50, 300, 1500, 12000};

        for (double pedido : pedidos) {
            System.out.println("========================================");
            System.out.println("\nProcessando pedido de reembolso de R$ " + pedido);
            funcionario.processarPedido(pedido); //inicia a cadeia com o func
        }
    }
}
