package Service; // ou database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/finance_db";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234"; // Coloque a senha que você digitou no terminal

    public static Connection obterConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("❌ Erro ao conectar ao banco: " + e.getMessage());
            return null;
        }
    }
}