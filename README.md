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

`POST` /futuroverde/api/cadastro/usuario

| campo |         tipo            |       obrigatório        |               descrição                        |
|-------|-------------------------|--------------------------|------------------------------------------------|
| nome |     texto            |          sim             | é o nome do usuário  |
| e-mail |    texto               |          sim             | é o e-mail do usuário |
| senha |      texto             |          sim             | é a senha do usuário, deve possuir no mínimo 6 caracteres |



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


### cadastrar receita 

`POST` /futuroverde/api/cadastro/receita

| campo |         tipo            |       obrigatório        |               descrição                        |
|-------|-------------------------|--------------------------|------------------------------------------------|
| nome |     texto            |          sim             | é o nome da receita   |
| ingredientes |    texto               |          sim             | ingredientes da receita  |
| modo de preparo |      texto             |          sim             | é o modo de preparo da receita |
| imagem |      imagem            |          sim             | é a imagem da receita |



**Exemplo de corpo do request**

```js
{
    "nome": "Escondidinho de carne vegetal",
    "ingredientes": "250 g de proteína de soja texturizada em flocos, 1 kg de batata, 1 cebola média, 1 colher de alho desidratado, Molho de tomate, 2 colheres de sopa, de manteiga, Sal a gosto, Pimenta-do-reino a gosto,1 gema de ovo",
    "modo de preparo ": "Deixe a proteína de soja de molho em água fervente por 20 minutos.
    Enquanto isso, prepare um refogado com a cebola, o alho, o sal, a pimenta e o molho de tomate quando os temperos já estiverem refogados.
    Deixe levantar fervura e acrescente a proteína de soja.
    Cozinhe por aproximadamente 5 minutos, desligue o fogo e reserve.
    Após retirar a casca da batata e cortá-la em pequenos pedaços, cozinhe com água e sal por aproximadamente 30 minutos ou até deixar a batata bem cozida.
    Retire do fogo, retire a água, amasse as batatas com um garfo.
    Acenda o fogo e adicione a manteiga, mexendo sempre até que se transforme em purê bem molinho.
    Caso não deseje deixar o purê mais cremoso, pode acrescentar leite.
    Coloque a proteína de soja em uma forma cobrindo todo o fundo.
    Em seguida, acrescente o purê de batata, cobrindo toda a proteína de soja.
    Pincele com a gema e leve ao forno em temperatura média até dourar.",
    "imagem": "images/receita"    
}
```

**Códigos de resposta**


| código | descrição 
|-|-
| 201 | receita cadastrada com sucesso
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
