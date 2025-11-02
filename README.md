# Projeto Microsserviços: Warehouse & Storefront

## 🧩 Descrição do Projeto

Este projeto tem como objetivo desenvolver uma arquitetura de **microsserviços** em Java utilizando **Spring Boot**, contemplando comunicação síncrona via HTTP e assíncrona via **RabbitMQ**.  
O projeto consiste em dois microsserviços principais:

- **Warehouse** (Armazém): gerencia o estoque dos produtos, controle de disponibilidade e atualizações.  
- **Storefront** (Vitrine): exibe produtos aos clientes e consome informações do warehouse tanto via API quanto via mensageria RabbitMQ.

O projeto foi criado como parte do desafio da DIO para consolidar conceitos de microsserviços, Spring Boot, RabbitMQ e práticas de desenvolvimento colaborativo com GitHub.

---

## 🎯 Objetivos de Aprendizagem

- Reproduzir ou aprimorar um projeto existente em Java e Spring Boot.  
- Criar microsserviços independentes que se comunicam de forma síncrona e assíncrona.  
- Integrar **RabbitMQ** para mensageria entre serviços.  
- Utilizar Spring Data JPA para persistência com bancos de dados relacionais.  
- Aplicar **MapStruct** para mapeamento entre DTOs e entidades.  
- Documentar e versionar o projeto utilizando GitHub.  

---

## 🏗️ Estrutura do Projeto

```
root
│
├── warehouse
│   ├── src/main/java/...
│   ├── src/main/resources/application.yml
│   └── Dockerfile (opcional)
│
├── storefront
│   ├── src/main/java/...
│   ├── src/main/resources/application.yml
│   └── Dockerfile (opcional)
│
└── README.md
```

---

## 💡 Tecnologias Utilizadas

- Java 21  
- Spring Boot 3  
- Spring Data JPA  
- RabbitMQ (CloudAMQP)  
- MapStruct  
- Lombok  
- H2 Database (ambiente de teste)  
- SpringDoc OpenAPI (documentação de API)  
- Git e GitHub  
