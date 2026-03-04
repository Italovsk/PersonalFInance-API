package service;

import Service.ConexaoDB;
import model.Transacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class TransacaoDAO {
    public void salvarNoBanco(Transacao t) {
        String sql = "INSERT INTO transacoes (descricao, valor, tipo, data_registro) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoDB.obterConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, t.getDescricao());
            stmt.setDouble(2, t.getValor());
            stmt.setString(3, t.getTipo());
            stmt.setDate(4, Date.valueOf(t.getData())); // Converte LocalDate para SQL Date

            stmt.executeUpdate();
            System.out.println("🚀 Dados enviados para o MySQL com sucesso!");

        } catch (SQLException e) {
            System.err.println("❌ Erro ao inserir no banco: " + e.getMessage());
        }
    }
}