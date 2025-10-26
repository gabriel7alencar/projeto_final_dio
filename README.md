# 🚀 Projeto Final DIO: Microsserviços com Spring Boot

Este repositório contém o projeto final desenvolvido como parte do bootcamp da Digital Innovation One (DIO), focado na construção de uma arquitetura de microsserviços utilizando o ecossistema Spring Boot e a linguagem Java.

## 🛠️ Tecnologias Utilizadas

O projeto foi construído com as seguintes tecnologias e ferramentas, garantindo uma aplicação moderna, robusta e escalável:

| Categoria | Tecnologia | Versão | Descrição |
| :--- | :--- | :--- | :--- |
| **Linguagem** | Java | 21 | A linguagem base para o desenvolvimento backend. |
| **Framework** | Spring Boot | 3.5.7 | Utilizado para facilitar a criação de aplicações Spring autônomas e prontas para produção. |
| **Build Tool** | Gradle | - | Gerenciador de dependências e automação de build, utilizando Kotlin DSL. |
| **Mensageria** | RabbitMQ | - | Implementação de mensageria assíncrona via Spring AMQP para comunicação entre os microsserviços. |
| **Persistência** | Spring Data JPA | - | Abstração para acesso a dados, simplificando as operações de banco de dados. |
| **Mapeamento** | MapStruct | 1.6.3 | Gerador de código para mapeamento de objetos (DTOs para Entidades e vice-versa). |
| **Documentação** | Springdoc OpenAPI | 2.8.4 | Geração automática de documentação de API (Swagger UI). |
| **Banco de Dados** | H2 Database | - | Banco de dados em memória utilizado para desenvolvimento e testes. |
| **Produtividade** | Lombok | - | Biblioteca para reduzir o código boilerplate em classes Java. |
| **Testes** | JUnit 5 | - | Framework de testes unitários e de integração. |

### Badges Visuais

Abaixo estão os ícones visuais das principais tecnologias:

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?style=for-the-badge&logo=rabbitmq&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)
![Lombok](https://img.shields.io/badge/Lombok-FF4081?style=for-the-badge&logo=lombok&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Microservices](https://img.shields.io/badge/Microservices-000000?style=for-the-badge&logo=micro-dot&logoColor=white)

## 🏗️ Arquitetura do Projeto

O projeto segue uma abordagem modular, dividida em dois microsserviços principais:

1.  **`storefront`**: Responsável pela interface da loja ou pelo gateway de API, lidando com as requisições externas e orquestrando a comunicação com outros serviços.
2.  **`warehouse`**: Responsável pela lógica de negócio e persistência de dados relacionados ao estoque e armazém.

A comunicação entre os serviços é realizada de forma assíncrona, utilizando o **RabbitMQ** para garantir a resiliência e o desacoplamento.

## ⚙️ Configuração e Execução

### Pré-requisitos

Para executar este projeto, você precisará ter instalado:

*   **Java Development Kit (JDK) 21** ou superior.
*   **Docker** e **Docker Compose** (para rodar o RabbitMQ e outros serviços de infraestrutura).
*   **Gradle** (opcional, pode ser usado o wrapper `gradlew`).

### Passos para Rodar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/gabriel7alencar/projeto_final_dio.git
    cd projeto_final_dio
    ```

2.  **Inicie o RabbitMQ (Infraestrutura):**
    *   *Nota:* Assumindo que o projeto utiliza Docker Compose para infraestrutura. Se não for o caso, este passo deve ser adaptado para iniciar o RabbitMQ localmente.

3.  **Execute os Microsserviços:**
    *   **Módulo `storefront`:**
        ```bash
        ./gradlew :storefront:bootRun
        ```
    *   **Módulo `warehouse`:**
        ```bash
        ./gradlew :warehouse:bootRun
        ```

Os serviços estarão disponíveis em portas diferentes (padrão Spring Boot: 8080, 8081, etc., dependendo da configuração no `application.properties` ou `application.yml`).
