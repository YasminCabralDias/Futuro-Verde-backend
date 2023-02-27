# projeto-Digital-Business-Enablement

Fazer a descrição da API

Exp (PiggyBank): Uma Api para o sistema de controle de gastos pessoais


## Endpoints

Exp (PiggyBank)
- Despesas
    - [Cadastrar](#cadastrar-despesa)
    - Listar todas
    - Apagar
    - Alterar
    - Mostrar os detalhes
- Contas
    - Cadastrar
    - Listar todas
    - Apagar
    - Alterar
    - Mostrar os detalhes
- Categorias

### Cadastrar Despesa

`POST` /piggybank/api/despesa

| campo |         tipo            |       obrigatório        |               descrição                        |
|-------|-------------------------|--------------------------|------------------------------------------------|
| valor |        decimal          |          sim             | é o valor da despesa, deve ser maior que zero  |
| categoria_id |        int          |          sim             | é o id de uma categoria previamente cadastrada |


**Exemplo de corpo do request**

```js
{
    "valor": 100.00,
    "categoria": {
        "categoria_id" : 1,
        "nome" : "lazer"
    },
    "conta" : {
        "conta_id" : 1,
        "nome" : "itaú"
    }
    "data": "2023-01-27",
    "descricao": "cinema com os amigos"
}
```
