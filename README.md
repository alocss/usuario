# 🧑‍💻 Sistema de Cadastro de Usuários

Aplicação backend desenvolvida em **Java 17** com **Spring Boot**, que expõe uma **API RESTful** para gerenciamento de usuários (CRUD). O projeto utiliza **Gradle** como ferramenta de build e inclui automação de testes e pipeline de integração contínua com **GitHub Actions**.

## 🚀 Tecnologias e Ferramentas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Banco de dados (PostgreSQL, H2 ou outro via configuração)  
- JUnit e Mockito (Testes Unitários)  
- Gradle (Build e gerenciamento de dependências)  
- GitHub Actions (CI/CD)

## 📁 Estrutura do Projeto

usuario/
### ├── src/
### │ ├── main/java/
### │ │ └── com/exemplo/usuario/
### │ │ ├── controller/
### │ │ ├── service/
### │ │ ├── repository/
### │ │ ├── model/
### │ │ └── dto/
### │ └── test/java/
### │ └── com/exemplo/usuario/
### ├── build.gradle
### ├── settings.gradle
### └── .github/workflows/

## 🔧 Configuração e Execução

 1. Clonar o repositório  ```bash git clone https://github.com/alocss/usuario.git cd usuario
 2. . Construir o projeto

  ./gradlew build

3. Executar localmente

  ./gradlew bootRun

A API estará disponível em: http://localhost:8080

    Você pode alterar a porta ou as configurações de banco no arquivo application.properties ou application.yml.

🧪 Executando os Testes

  ./gradlew test

Os testes estão localizados em src/test/java/, utilizando JUnit 5 e Mockito.

📌 Endpoints REST (exemplo)
Método	Endpoint	Descrição
### GET	/usuarios	Lista todos os usuários
### GET	/usuarios/{id}	Busca usuário por ID
### POST	/usuarios	Cria um novo usuário
### PUT	/usuarios/{id}	Atualiza dados do usuário
### DELETE	/usuarios/{id}	Remove um usuário




