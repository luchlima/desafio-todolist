<h1 align="center">
  TO-DO List
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.


## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

A API poderá ser acessada em [localhost:8080](http://localhost:8080)

O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, deverá visualizar pela documentação Swagger acima.

- Criar Tarefa (POST)
```
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Ir todos os dias",
    "realizado": true,
    "prioridade": 1
  }
]
```

- Listar Tarefas (GET)
```
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Ir todos os dias",
    "realizado": true,
    "prioridade": 1
  }
]
```

- Atualizar Tarefa (UPDATE)
```
[
  {
    "id": 1,
    "nome": "Academia",
    "descricao": "Ir 3 vezes na semana",
    "realizado": true,
    "prioridade": 1
  }
]
```

- Remover Tarefa (DELETE)
```
    Digitar apenas o ID da tarefa.
```