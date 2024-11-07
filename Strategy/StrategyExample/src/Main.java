public class Main {

    public static void main(String[] args) {

        double precoOriginal = 100.0;

        DescontoStrategy descNatal = new DescontoNatal();
        DescontoStrategy descVIP = new DescontoVIP();

        CalcDesconto calculadora = new CalcDesconto(descNatal);
        System.out.println("Preco com desc de natal: " + calculadora.calcularPrecoDesc(precoOriginal));

        calculadora.setStrategy(descVIP);
        System.out.println("Preco com desc VIP: " + calculadora.calcularPrecoDesc(precoOriginal));


    }


}
