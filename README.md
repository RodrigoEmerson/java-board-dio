# Java Board DIO

Este projeto é uma aplicação Java desenvolvida como parte de um desafio da Digital Innovation One (DIO). O objetivo é demonstrar conceitos de programação orientada a objetos, manipulação de dados e lógica de negócios em Java.

## Descrição

O Java Board DIO é um sistema simples que simula um quadro de tarefas (board), permitindo o cadastro, listagem e gerenciamento de tarefas. Ele serve como base para estudos de boas práticas em Java, organização de código e aplicação de conceitos fundamentais.

## Funcionalidades

- Cadastro de tarefas
- Listagem de tarefas cadastradas
- Atualização do status das tarefas
- Remoção de tarefas
- Interface de linha de comando para interação

## Pré-requisitos

- [Java JDK 8+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/) (opcional, caso utilize dependências ou queira facilitar o build)
- Editor de código ou IDE (ex: VS Code, IntelliJ IDEA, Eclipse)

## Instalação

1. Clone este repositório:
   ```bash
   git clone https://github.com/RodrigoEmerson/java-board-dio.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd java-board-dio
   ```
3. Compile o projeto:
   ```bash
   javac -d bin src/*.java
   ```

## Como Executar

1. Após compilar, execute o programa principal:
   ```bash
   java -cp bin Main
   ```
   *(Substitua `Main` pelo nome da classe principal, se diferente.)*

## Exemplo de Uso

Ao iniciar, o sistema exibirá um menu com opções para cadastrar, listar, atualizar ou remover tarefas. Basta seguir as instruções na tela e digitar a opção desejada.

```
===== Java Board DIO =====
1. Cadastrar tarefa
2. Listar tarefas
3. Atualizar tarefa
4. Remover tarefa
5. Sair
Escolha uma opção:
```

## Observações

- O projeto é didático e pode ser expandido com novas funcionalidades.
- Caso utilize IDE, importe o projeto como um projeto Java padrão.
- Para dúvidas ou sugestões, abra uma issue no repositório.

## Autor

[Rodrigo Emerson](https://github.com/RodrigoEmerson)

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
