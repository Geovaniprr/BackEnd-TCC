# CaEntreNos API

## Visão Geral

O CaEntreNos é uma API projetada para facilitar a comunicacao nas escolas, abrangendo desde o cadastro e gerenciamento de responsáveis, alunos, administradores até a administração de relatos. Esta API foi desenvolvida com Spring Boot, aderindo às melhores práticas.
## Principais Funcionalidades

- Registro, atualização, listagem e remoção de responsáveis.
- Registro, atualização, listagem e remoção de alunos.
- Registro, atualização, listagem e remoção de administradores.
- Criação, resposta, listagem e exclusão de relatos.
- Autenticação via JWT para administradores e alunos.
- Documentação completa da API através do Swagger.
- Interface Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- Documentação JSON (OpenAPI): [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.2.4
- Spring Data JPA
- Spring Security
- Hibernate
- JWT (JSON Web Token)
- Maven
- MySQL
- Swagger (springdoc-openapi)

## Configuração do Ambiente

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.8 ou superior
- MySQL Server
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)

### Configuração do Banco de Dados

Certifique-se de que você tem um banco de dados MySQL configurado. Ajuste as configurações de conexão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/caentrenos
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
