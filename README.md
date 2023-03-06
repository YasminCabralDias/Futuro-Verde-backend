# projeto-Digital-Business-Enablement

Uma Api para o sistema da aplicação Futuro Verde.


## Endpoints

- Usuários
    - [Cadastrar](#cadastrar-usuario)
    - Apagar
    - Alterar
    - Mostrar detalhes
- Receitas
    - [Cadastrar](#cadastrar-receita)
    - Listar todas
    - Apagar
    - Alterar
    - Mostrar detalhes

### Cadastrar usuário 

`POST` /piggybank/api/despesa

| campo |         tipo            |       obrigatório        |               descrição                        |
|-------|-------------------------|--------------------------|------------------------------------------------|
| nome |                 |          sim             | é o nome do usuário  |
| e-mail |                 |          sim             | é o e-mail do usuário |
| senha |                 |          sim             | é a senha do usuário |



**Exemplo de corpo do request**

```js
{
    "nome": "Yasmin Dias",
    "e-mail": "yasmincd102@gmail.com",
    "senha": "abcd1234"
    
}
```

**Códigos de resposta**


| código | descrição 
|-|-
| 201 | usuário cadastrado com sucesso
| 400 | erro na validação dos dados da requisição

---



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
