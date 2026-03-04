# 💰 PersonalFinance-API

Sistema de gerenciamento de finanças pessoais desenvolvido em **Java** para controle de receitas e despesas com persistência de dados.

## 🚀 Sobre o Projeto
Este projeto foi desenvolvido para aplicar conceitos de **Programação Orientada a Objetos (POO)** e persistência de dados em arquivos. O sistema permite que o usuário cadastre transações via console e armazene o histórico em um arquivo `.txt`, garantindo que os dados não sejam perdidos ao fechar a aplicação.

## 🛠️ Tecnologias Utilizadas
* **Java 17+**: Linguagem principal.
* **Maven**: Gerenciamento de dependências e estrutura do projeto.
* **File I/O**: Manipulação de arquivos para salvamento real.

## 📂 Estrutura de Pacotes
O projeto segue padrões de organização de mercado:
* `model`: Classes de entidade (ex: Transacao).
* `service`: Lógica de negócio e persistência (ex: ArquivoService).

## 🔧 Como Executar
1. Clone o repositório.
2. Abra o projeto em uma IDE (recomendado IntelliJ IDEA).
3. Certifique-se de carregar as dependências do Maven (clique no ícone do 'M').
4. Execute a classe `Main.java`.

## 📈 Próximos Passos
- [ ] Implementar conexão com banco de dados MySQL.
- [ ] Adicionar filtros por categoria ou data.
- [ ] Criar testes unitários com JUnit.