public class RealDatabase implements Database {
    public RealDatabase() {
        //como se fosse a inicialização do banco de dados
        System.out.println("Conectando ao banco de dados...");
        try {
            Thread.sleep(2000); //2 segundos p simular o tempo de conexão
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Conexão estabelecida!");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executando consulta: " + sql);
    }
}
