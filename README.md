# 🏦 BankSimulator

Simulador de banco desenvolvido em Java, utilizando JPA para persistência de dados. O projeto permite criar contas, realizar transferências e consultar extratos de forma simples e funcional.

---

## 📚 Tecnologias Utilizadas

- Java
- JPA (Java Persistence API)
- Maven
- JavaFX (caso inclua interface)
- Banco de dados (ex: H2, MySQL, ou outro via JPA)
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

BankSimulator/ <br>
├── .idea/ # Configurações do projeto (IDE) <br>
├── src/ <br>
│ └── main/ <br>
│ ├── java/ <br>
│ │ └── com/exemplo/banco/ <br>
│ │ ├── Main.java <br>
│ │ ├── entity/ <br>
│ │ │ ├── Conta.java <br>
│ │ │ └── Transacao.java <br>
│ │ ├── repository/ <br>
│ │ │ ├── ContaRepository.java <br>
│ │ │ └── TransacaoRepository.java <br>
│ │ └── service/ <br>
│ │ └── BancoService.java <br>
│ └── resources/ <br>
│ └── META-INF/persistence.xml <br>
├── pom.xml

---


## ⚙️ Funcionalidades

- Criar contas bancárias
- Realizar transferências entre contas
- Consultar extratos de transações
- Persistência de dados via JPA

---

## ✅ Status

✅Entidades implementadas <br>
✅Repositórios JPA criados<br>
✅Lógica de transferência e extrato<br>
❌Interface gráfica com JavaFX (em desenvolvimento)
