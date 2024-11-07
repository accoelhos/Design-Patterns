public class Main {
    public static void main(String[] args) throws Exception {
        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        AppClima app1 = new AppClima("Clima Tempo");
        AppClima app2 = new AppClima("Tempo Agora");

        estacao.addApp(app1);
        estacao.addApp(app2);
        System.out.println("Mudando a temperatura para 25.5°C");
        estacao.setTemperatura(25.5f);

        System.out.println("\nMudando a temperatura para 30.0°C");
        estacao.setTemperatura(30.0f);
    }
}
