package br.com.fiap.futuroverde.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.futuroverde.models.Receita;
import br.com.fiap.futuroverde.models.Usuario;
import br.com.fiap.futuroverde.repository.ReceitaRepository;
import br.com.fiap.futuroverde.repository.UsuarioRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    ReceitaRepository receitaRepository;

    @Override
    public void run (String... args) throws Exception {
        Usuario usuario1 = new Usuario(1, "yasmin", "yasmin@gmail.com", "1234567");
        Usuario usuario2 = new Usuario(2, "yasminn", "yas@gmail.com", "abcdefgh");

        
        usuarioRepository.saveAll(List.of(usuario1,usuario2));

        receitaRepository.saveAll(List.of(
        Receita.builder().nome("Suco de frutas vermelhas")
        .ingredientes("água, morango e amora").modoPreparo("bater todos os ingredientes no liquidificador")
        .imagem("img/sucoImg").usuario(usuario1).build(),

        Receita.builder().nome("Vitamina de morango")
        .ingredientes("leite, morango e açúcar").modoPreparo("bater todos os ingredientes no liquidificador")
        .imagem("img/vitaminaImg").usuario(usuario2).build(),

        Receita.builder().nome("Sorvete de frutas")
        .ingredientes("leite, morango, banana e açúcar").modoPreparo("bater todos os ingredientes no liquidificador e levar ao congelador por 5 horas")
        .imagem("img/sorveteFoto").usuario(usuario2).build(),

        Receita.builder().nome("Vitamina de banana")
        .ingredientes("leite, banana e açúcar").modoPreparo("bater todos os ingredientes no liquidificador")
        .imagem("img/vitaminaBananaImg").usuario(usuario1).build(),

        Receita.builder().nome("Cookie simples")
        .ingredientes("margarina, farinha de trigo e açúcar").modoPreparo("misturar os  ingredientes até ficar uma massa homogênea, faça bolinhas de massa e leve ao forno por 15 minutos")
        .imagem("img/cookie").usuario(usuario1).build(),

        Receita.builder().nome("Brigadeiro")
        .ingredientes("leite  condensado e achocolatado").modoPreparo("misturar todos os ingredientes em fogo baixo até ficar homogêneo")
        .imagem("img/vitaminaBananaImg").usuario(usuario1).build(),

        Receita.builder().nome("Mousse de chocolate")
        .ingredientes("creme de leite, chocolate meio amargo e ovo").modoPreparo("misturar tudo suavemente e depois levar à geladeira por 2 horas")
        .imagem("img/mousseChocolate").usuario(usuario2).build()



        ));
    }
}
