package Service;

import model.Transacao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class ArquivoService {
    private static final String NOME_ARQUIVO = "relatorio_gastos.txt";

    public void salvarNoArquivo(Transacao t) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // O parâmetro 'true' indica que vamos adicionar dados ao final do arquivo (append)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOME_ARQUIVO, true))) {
            String linha = String.format("[%s] %s: R$ %.2f | Data: %s",
                    t.getTipo(), t.getDescricao(), t.getValor(), t.getData().format(formatador));

            writer.write(linha);
            writer.newLine();
            System.out.println("✅ Transação salva no arquivo!");
        } catch (IOException e) {
            System.err.println("❌ Erro ao salvar: " + e.getMessage());
        }
    }
}