public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    @Override
    public void query(String sql) {
        //inicialização preguiçosa: só cria a conexão quando é realmente necessária
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }
        //ele que vai chamar a ação do objeto real
        realDatabase.query(sql);
    }
}
