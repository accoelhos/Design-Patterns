public class Cliente {
    public static void main(String[] args) {
        Database database = new DatabaseProxy();

        // Primeira consulta - vai inicializar a conexão.
        database.query("SELECT * FROM Alunos");

        // Segunda consulta - a conexão já está estabelecida.
        database.query("SELECT * FROM Produtos");
    }
}

