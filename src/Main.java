import Service.ArquivoService;
import model.Transacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Transacao> listaDeTransacoes = new ArrayList<>();

        System.out.println("=== 💰 PERSONAL FINANCE API v1.0 ===");

        while (true) {
            System.out.println("\n1. Nova Receita | 2. Nova Despesa | 3. Ver Extrato | 0. Sair");
            System.out.print("Escolha: ");
            int opcao = leitor.nextInt();
            leitor.nextLine(); // Limpa o buffer

            if (opcao == 0) break;

            if (opcao == 1 || opcao == 2) {
                System.out.print("Descrição: ");
                String desc = leitor.nextLine();
                System.out.print("Valor: ");
                double val = leitor.nextDouble();


                // 1. Primeiro definimos o TIPO (Isso deve vir antes de criar a Transacao)
                String tipo = (opcao == 1) ? "RECEITA" : "DESPESA";

// 2. Agora criamos o objeto usando a variável 'tipo' que acabamos de criar
                Transacao novaTransacao = new Transacao(desc, val, tipo);

// 3. Adicionamos na lista da memória
                listaDeTransacoes.add(novaTransacao);
                System.out.println("✅ Salvo com sucesso!");

// 4. Salvamos no arquivo de texto
                ArquivoService service = new ArquivoService();
                service.TransacaoDAO bancoService = new service.TransacaoDAO();
                bancoService.salvarNoBanco(novaTransacao);
                service.salvarNoArquivo(novaTransacao);
            } else if (opcao == 3) {
                System.out.println("\n--- EXTRATO ATUAL ---");
                for (Transacao t : listaDeTransacoes) {
                    System.out.printf("[%s] %s: R$ %.2f em %s\n",
                            t.getTipo(), t.getDescricao(), t.getValor(), t.getData());
                }
            }
        }
        System.out.println("Sistema encerrado.");
    }
}