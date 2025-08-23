# DSList - Lista de Jogos por Categoria

> Um sistema simples para gerenciar uma lista de jogos categorizados, com backend em Java/Spring Boot, banco de dados PostgreSQL e containerização com Docker. Deployado no [Render](https://render.com).

---

## 🔧 Tecnologias Utilizadas

- **Backend**: Java + Spring Boot
- **Banco de Dados**: PostgreSQL
- **Containerização**: Docker
- **Deploy**: Render (cloud)
- **Ferramentas**: pgAdmin, Postman, Docker Desktop

---

## 🌐 Arquitetura do Projeto

A aplicação segue uma arquitetura modular e escalável:
- O backend é um microserviço Spring Boot.
### 4. Requisição GET /games (Postman)
![Postman - GET /games](./screenshots/postman-get-games.png)
- 
### 5. Requisição GET /games (Postman)
![Postman - POST /games](./screenshots/postman-post-game.png)
- 
### 2. Banco de Dados PostgreSQL (pgAdmin)
- O banco de dados PostgreSQL está em um container separado.
  ![Banco de Dados PostgreSQL](./screenshots/pgadmin-db.png)

- A aplicação é containerizada com Docker para fácil deploy.
- 
- O deploy é feito no Render, com auto-scale e logs integrados.
  ### 3. Logs no Render (deploy online)
![Logs no Render](./screenshots/render-logs.png)
---

## 🚀 Como Rodar Localmente

### 1. Pré-requisitos
- Docker instalado
- Docker Desktop ativo

### 1. Containers Docker em execução
![Docker Containers](./screenshots/docker-containers.png)

### 2. Executar os containers
```bash
docker-compose up --build
