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

BankSimulator/ 
├── .idea/ # Configurações do projeto (IDE) 
├── src/ 
│ └── main/ 
│ ├── java/ 
│ │ └── com/exemplo/banco/ 
│ │ ├── Main.java 
│ │ ├── entity/ 
│ │ │ ├── Conta.java 
│ │ │ └── Transacao.java 
│ │ ├── repository/ 
│ │ │ ├── ContaRepository.java 
│ │ │ └── TransacaoRepository.java 
│ │ └── service/ 
│ │ └── BancoService.java 
│ └── resources/ 
│ └── META-INF/persistence.xml 
├── pom.xml

---


## ⚙️ Funcionalidades

- Criar contas bancárias
- Realizar transferências entre contas
- Consultar extratos de transações
- Persistência de dados via JPA

---

## ✅ Status

✅Entidades implementadas
✅Repositórios JPA criados
✅Lógica de transferência e extrato
❌Interface gráfica com JavaFX (em desenvolvimento)
