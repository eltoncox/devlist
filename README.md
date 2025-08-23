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
- O banco de dados PostgreSQL está em um container separado.
- A aplicação é containerizada com Docker para fácil deploy.
- O deploy é feito no Render, com auto-scale e logs integrados.

---

## 🚀 Como Rodar Localmente

### 1. Pré-requisitos
- Docker instalado
- Docker Desktop ativo

### 2. Executar os containers
```bash
docker-compose up --build

 Screenshots
1. Containers Docker em execução


Os containers estão em execução: ubuntu:24.04, dslist-app e dev. O container dslist-app expõe a porta 8080 para acesso local. 

2. Banco de Dados PostgreSQL (pgAdmin)


Visualização da tabela tb_game_list no pgAdmin. Os dados são armazenados com ID e nome da categoria de jogos. 

3. Logs no Render (deploy online)


O serviço foi iniciado com sucesso no Render. O log mostra que a aplicação está "live" e acessível em https://devlist-aacp.onrender.com. 

🛠️ Testando a API (Postman)
Incluí screenshots do Postman para mostrar que a API funciona corretamente:

4. Requisição GET /games


Retorna todos os jogos cadastrados na base de dados. 

5. Requisição POST /games


Cria um novo jogo com nome, descrição e categoria. 


