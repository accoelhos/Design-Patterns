public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    @Override
    public void query(String sql) {
        // Inicialização preguiçosa: só cria a conexão quando é realmente necessária.
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }
        realDatabase.query(sql);
    }
}
